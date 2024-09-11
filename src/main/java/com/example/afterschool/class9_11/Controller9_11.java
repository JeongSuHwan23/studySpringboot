package com.example.afterschool.class9_11;


import com.example.school.class9_3.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class Controller9_11 {
  private final GradesRepository GradesRepository;
  private final SubjectsRepository SubjectsRepository;
  private final StudentsRepository StudentsRepository;

  @GetMapping("/write-students")
  String writeStudents() {
    return "afterschool/class9_11/students";
  }

  @GetMapping("/list-students")
  String listStudents(Model model) {
    List<Students> result = StudentsRepository.findAll();
    model.addAttribute("Students", result);
    return "afterschool/class9_11/students_list";
  }

  @PostMapping("/add-students")
  String addStudents(@ModelAttribute Students students) {
    StudentsRepository.save(students);
    return "redirect:/list-students";
  }

  @GetMapping("/write-subjects")
  String writeSubjects() {
    return "afterschool/class9_11/subjects";
  }

  @GetMapping("/list-subjects")
  String listSubjects(Model model) {
    List<Subjects> result = SubjectsRepository.findAll();
    model.addAttribute("Subjects", result);
    return "afterschool/class9_11/subjects_list";
  }

  @PostMapping("/add-subjects")
  String addStudents(@ModelAttribute Subjects subjects) {
    SubjectsRepository.save(subjects);
    return "redirect:/list-subjects";
  }

  @GetMapping("/write-grades")
  String writeGrades() {
    return "afterschool/class9_11/grades";
  }

  @GetMapping("/list-grades")
  String listGrades(Model model) {
    List<Grades> result = GradesRepository.findAll();
    model.addAttribute("Grades", result);
    return "afterschool/class9_11/grades_list";
  }

  @PostMapping("/add-grades")
  String addGrades(@ModelAttribute Grades grades) {
    GradesRepository.save(grades);
    return "redirect:/list-grades";
  }
}