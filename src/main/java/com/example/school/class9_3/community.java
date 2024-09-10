package com.example.school.class9_3;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class community {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  @Column(length = 200)
  public String title;
  public String subTitle;
  public String date;
}

