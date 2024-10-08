package com.example.afterschool.services;

import com.example.afterschool.repository.StudentRepository;
import com.example.afterschool.tables.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

  @Autowired
  private StudentRepository studentRepository;

  public void saveStudent(Student student) {
    studentRepository.save(student);
  }

  public List<Student> findAllStudents() {
    return studentRepository.findAll();
  }

  public Optional<Student> findStudentById(Integer studentId) {
    return studentRepository.findById(studentId);
  }
}
