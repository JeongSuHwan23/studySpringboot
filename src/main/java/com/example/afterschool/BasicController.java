package com.example.afterschool;


import com.example.afterschool.repository.*;
import com.example.afterschool.services.CourseService;
import com.example.afterschool.services.StudentService;
import com.example.afterschool.tables.*;
import com.example.school.db.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class BasicController {
  private final GradesRepository GradesRepository;
  private final SubjectsRepository SubjectsRepository;
  private final StudentsRepository StudentsRepository;
  private final UsersRepository usersRepository;
  private final ProductRepository ProductRepository;
  private final OrdersRepository OrdersRepository;
  private final Order_ItemsRepository Order_ItemsRepository;
  private final ReviewsRepository ReviewsRepository;



  @GetMapping("/users")
  public String user(Model model){
    List<Users> result = usersRepository.findAll();
    model.addAttribute("users", result);

    return "afterschool/class9_4/users";
  }


  @GetMapping("/product")
  public String product(Model model){
    List<Product> result = ProductRepository.findAll();
    model.addAttribute("product", result);

    return "afterschool/class9_4/product";
  }

  @GetMapping("/orders")
  public String orders(Model model){
    List<Orders> result = OrdersRepository.findAll();
    model.addAttribute("orders", result);

    return "afterschool/class9_4/orders";
  }

  @GetMapping("/order_items")
  public String orderItem(Model model){
    List<Order_Items> result = Order_ItemsRepository.findAll();
    model.addAttribute("order_items", result);

    return "afterschool/class9_4/order_items";
  }

  @GetMapping("/reviews")
  public String reviews(Model model){
    List<Reviews> result = ReviewsRepository.findAll();
    model.addAttribute("reviews", result);

    return "afterschool/class9_4/reviews";
  }
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