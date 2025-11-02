package com.fitness.log.backend.controllers;

import com.fitness.log.backend.models.Exercise;
import com.fitness.log.backend.services.ExerciseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  private final ExerciseService exerciseService;

  @Autowired
  public ApiController(ExerciseService exerciseService) {
    this.exerciseService = exerciseService;
  }

  @GetMapping("/api/exercises/search")
  public List<Exercise> searchExercises(
      @RequestParam(required = false) String force,
      @RequestParam(required = false) String level,
      @RequestParam(required = false) String mechanic,
      @RequestParam(required = false) String equipment,
      @RequestParam(required = false) List<String> primaryMuscles,
      @RequestParam(required = false) List<String> secondaryMuscles,
      @RequestParam(required = false) String category) {
    return exerciseService.findExercisesByCriteria(
        force, level, mechanic, equipment, primaryMuscles, secondaryMuscles, category);
  }

}
