package com.example.afterschool.repository;

import com.example.afterschool.tables.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}