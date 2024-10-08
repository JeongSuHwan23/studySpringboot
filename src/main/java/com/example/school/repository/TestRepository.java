package com.example.school.repository;

import com.example.school.db.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Integer> {

}