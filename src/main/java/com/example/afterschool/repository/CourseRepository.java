package com.example.afterschool.repository;

import com.example.afterschool.tables.Course;
import com.example.afterschool.tables.Order_Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
