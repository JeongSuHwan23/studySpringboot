package com.example.studyspringboot;

import jakarta.persistence.*;
import lombok.ToString;
import org.springframework.data.jpa.repository.JpaRepository;

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

