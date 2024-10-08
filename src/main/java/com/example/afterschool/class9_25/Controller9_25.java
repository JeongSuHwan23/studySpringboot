package com.example.afterschool.class9_25;

import com.example.afterschool.tables.Course;
import com.example.afterschool.tables.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

import com.example.afterschool.services.CourseService;
import com.example.afterschool.services.StudentService;

@Controller
@RequiredArgsConstructor
public class Controller9_25 {
  private final StudentService studentService;
  private final CourseService courseService;

  @GetMapping("/input-student")
  String student() {
    return "afterschool/class9_25/input_student.html";
  }

  @PostMapping("/input-student")
  String studentInput(@ModelAttribute Student student) {
    studentService.saveStudent(student);
    return "redirect:student-list";
  }

  @GetMapping("/student-list")
  String studentList(Model model) {
    List<Student> result = studentService.findAllStudents();
    model.addAttribute("student", result);
    return "afterschool/class9_25/student_list";
  }

  @GetMapping("/input-course")
  String course() {
    return "afterschool/class9_25/input_course.html";
  }

  @PostMapping("/input-course")
  String courseInput(@ModelAttribute Course course) {
    courseService.saveCourse(course);
    return "redirect:course-list";
  }

  @GetMapping("/course-list")
  String courseList(Model model) {
    List<Course> result = courseService.findAllCourses();
    model.addAttribute("course", result);
    return "afterschool/class9_25/course_list";
  }

  @GetMapping("/course-detail/{course_id}")
  public String detailCourse(@PathVariable Integer course_id, Model model) {
    Optional<Course> result = courseService.findCourseById(course_id);
    if (result.isPresent()) {
      Course course = result.get();
      model.addAttribute("course_id", course.getCourse_id());
      model.addAttribute("course_name", course.getCourse_name());
      model.addAttribute("instructor", course.getInstructor());
      return "afterschool/class9_25/course_detail";
    }
    return "error";
  }

  @GetMapping("/student-detail/{student_id}")
  public String detailStudent(@PathVariable Integer student_id, Model model) {
    Optional<Student> result = studentService.findStudentById(student_id);
    if (result.isPresent()) {
      Student student = result.get();
      model.addAttribute("student_id", student.getStudent_id());
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("major", student.getMajor());
      return "afterschool/class9_25/student_detail";
    }
    return "error";
  }
}
