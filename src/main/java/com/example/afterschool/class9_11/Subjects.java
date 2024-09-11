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
@Getter
@Setter
public class Subjects {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer subject_id;
  private String subject_name;
  private Integer credit;
}
