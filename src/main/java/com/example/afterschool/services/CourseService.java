package com.example.afterschool.services;

import com.example.afterschool.repository.CourseRepository;
import com.example.afterschool.tables.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

  @Autowired
  private CourseRepository courseRepository;

  public void saveCourse(Course course) {
    courseRepository.save(course);
  }

  public List<Course> findAllCourses() {
    return courseRepository.findAll();
  }

  public Optional<Course> findCourseById(Integer courseId) {
    return courseRepository.findById(courseId);
  }
}
