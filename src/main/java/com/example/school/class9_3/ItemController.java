package com.example.school.class9_3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
  @GetMapping("items")
  String item(Model model) {
    model.addAttribute("name","바지");
    model.addAttribute("price","15000");
    model.addAttribute("count","100");
    return "list.html";
  }
}
