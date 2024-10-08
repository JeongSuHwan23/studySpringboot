package com.example.afterschool.repository;

import com.example.afterschool.tables.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}