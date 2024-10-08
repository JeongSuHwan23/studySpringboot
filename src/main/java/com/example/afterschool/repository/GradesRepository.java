package com.example.afterschool.repository;

import com.example.afterschool.tables.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository<Grades, Integer> {

}