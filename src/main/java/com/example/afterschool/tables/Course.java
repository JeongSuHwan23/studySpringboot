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
public class Course {
  @Id
  private Integer course_id;

  private String course_name;
  private String instructor;
}
