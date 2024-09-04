package com.example.afterschool.class9_4;
import jakarta.persistence.*;
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