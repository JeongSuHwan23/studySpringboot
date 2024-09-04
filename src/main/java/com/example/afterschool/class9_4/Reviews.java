package com.example.afterschool.class9_4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

import java.util.Date;
@Entity
@ToString
public class Reviews {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer review_id;
  public Integer product_id;
  public Integer user_id;
  public Integer rating;
  public String comment;
  public Date review_date;
}
