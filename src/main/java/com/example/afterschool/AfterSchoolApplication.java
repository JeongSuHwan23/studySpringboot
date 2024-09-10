package com.example.afterschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AfterSchoolApplication {
  public static void main(String[] args) {
    SpringApplication.run(AfterSchoolApplication.class, args);
    System.out.println("연결 완료");

  }
}
