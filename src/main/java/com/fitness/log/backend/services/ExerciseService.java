package com.fitness.log.backend.services;

import com.fitness.log.backend.models.Exercise;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {
  private final MongoTemplate mongoTemplate;


  @Autowired
  public ExerciseService(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }
  public  List<Exercise> findExercisesByCriteria(
      String force,
      String level,
      String mechanic,
      String equipment,
      List<String> primaryMuscles,
      List<String> secondaryMuscles,
      String category) {
    Query query = new Query();

    addStringCriteria(query, "force", force);
    addStringCriteria(query, "level", level);
    addStringCriteria(query, "mechanic", mechanic);
    addStringCriteria(query, "equipment", equipment);
    addStringCriteria(query, "category", category);

    addInCriteria(query, "primaryMuscles", primaryMuscles);
    addInCriteria(query, "secondaryMuscles", secondaryMuscles);

    return mongoTemplate.find(query, Exercise.class);
  }

  private void addStringCriteria(Query query, String field, String value) {
    if (value != null && !value.trim().isEmpty()) {
      query.addCriteria(Criteria.where(field).is(value));
    }
  }

  private void addInCriteria(Query query, String field, List<String> values) {
    if (values != null && !values.isEmpty()) {
      query.addCriteria(Criteria.where(field).in(values));
    }
  }


}