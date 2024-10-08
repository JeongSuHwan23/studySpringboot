package com.example.afterschool.repository;

import com.example.afterschool.tables.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {

}

