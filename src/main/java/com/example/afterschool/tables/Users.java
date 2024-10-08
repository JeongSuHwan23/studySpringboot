package com.example.afterschool.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

@Entity
@ToString
public class Users
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  public String username;
  public String email;
}