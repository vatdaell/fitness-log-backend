package com.fitness.log.backend.models;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "exercise_data")
public class Exercise {

  @Id
  private String id;

  @Field("name")
  private String name;

  @Field("force")
  private String force;

  @Field("level")
  private String level;

  @Field("mechanic")
  private String mechanic;

  @Field("equipment")
  private String equipment;

  @Field("primaryMuscles")
  private List<String> primaryMuscles;

  @Field("secondaryMuscles")
  private List<String> secondaryMuscles;

  @Field("instructions")
  private List<String> instructions;

  @Field("category")
  private String category;

  @Field("images")
  private List<String> images;

  // Default constructor (required for Spring Data MongoDB)
  public Exercise() {}

  // Getters and Setters
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getForce() {
    return force;
  }

  public void setForce(String force) {
    this.force = force;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getMechanic() {
    return mechanic;
  }

  public void setMechanic(String mechanic) {
    this.mechanic = mechanic;
  }

  public String getEquipment() {
    return equipment;
  }

  public void setEquipment(String equipment) {
    this.equipment = equipment;
  }

  public List<String> getPrimaryMuscles() {
    return primaryMuscles;
  }

  public void setPrimaryMuscles(List<String> primaryMuscles) {
    this.primaryMuscles = primaryMuscles;
  }

  public List<String> getSecondaryMuscles() {
    return secondaryMuscles;
  }

  public void setSecondaryMuscles(List<String> secondaryMuscles) {
    this.secondaryMuscles = secondaryMuscles;
  }

  public List<String> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<String> instructions) {
    this.instructions = instructions;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }
  @Override
  public String toString() {
    return "Exercise{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", force='" + force + '\'' +
        ", level='" + level + '\'' +
        ", mechanic='" + mechanic + '\'' +
        ", equipment='" + equipment + '\'' +
        ", primaryMuscles=" + primaryMuscles +
        ", secondaryMuscles=" + secondaryMuscles +
        ", instructions=" + instructions +
        ", category='" + category + '\'' +
        ", images=" + images +
        '}';
  }
}
