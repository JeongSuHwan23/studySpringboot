package com.example.school.class9_10;
import com.example.school.class9_3.Item;
import com.example.school.class9_3.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class BasicController {
  private final TestRepository testRepository;
  private final ItemRepository itemRepository;

  @GetMapping("/test")
  public String index(Model model) {
    List<Test> result = testRepository.findAll();
    model.addAttribute("test", result);
    return "school/class9_10/test";
  }

  @GetMapping("/list")
  public String list(Model model) {
    List<Item> result = itemRepository.findAll();
    model.addAttribute("item", result);
    return "school/class9_10/list";
  }

  @GetMapping("/write")
  String write() {
    return "school/class9_10/write.html";
  }

  @PostMapping("/add")
  String writePost(@ModelAttribute Item item) {
    itemRepository.save(item);
    return "redirect:/list";
  }


}
