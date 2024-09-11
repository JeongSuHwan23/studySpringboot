package com.example.afterschool.class9_11;

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
public class Students {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer student_id;

  private String name;
  private String birth_date;
  private String major;
}
