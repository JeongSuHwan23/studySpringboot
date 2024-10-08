package com.example.afterschool.repository;

import com.example.afterschool.tables.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

}