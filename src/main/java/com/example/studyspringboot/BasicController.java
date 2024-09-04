package com.example.studyspringboot;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BasicController {
  private final communityRepository communityRepository;

  @GetMapping("/")
  @ResponseBody
  String home() {
    return "Hello";
  }

  @GetMapping("/about")
  @ResponseBody
  String about() {
    return "피싱사이트에요";
  }

  @GetMapping("/html")
  @ResponseBody
  String h4() {
    return "<h4>반갑습니다</h4>";
  }

  @GetMapping("/html1")
  String html() {
    return "index.html";
  }

  @GetMapping("/date")
  @ResponseBody
  String date() {
    return new Date().toString();
  }

  @GetMapping("/result")
  @ResponseBody
  String result() {
    List<community> result = communityRepository.findAll();
    System.out.println(result);
    return "dsafadsf";
  }

}