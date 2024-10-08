package com.example.afterschool.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Setter
@Getter
public class Grades {
  @Id
  private Integer student_id;
  private Integer subject_id;
  private String grade;
}
