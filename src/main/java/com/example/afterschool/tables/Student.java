package com.example.afterschool.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Setter
@Getter
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer student_id;

  private String name;
  private Integer age;
  private String major;
}
