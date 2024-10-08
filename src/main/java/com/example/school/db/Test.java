package com.example.school.db;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Setter
@Getter
public class Test {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  @Column(length = 200)
  public String title;
  public String sub_title;
  public String date;
}
