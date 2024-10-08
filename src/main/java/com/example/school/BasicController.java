package com.example.school;
import com.example.school.db.Item;
import com.example.school.db.Test;
import com.example.school.db.community;
import com.example.school.repository.CommunityRepository;
import com.example.school.repository.ItemRepository;
import com.example.school.repository.TestRepository;
import com.example.school.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class BasicController {
  private final TestRepository testRepository;
  private final ItemRepository itemRepository;
  private final ItemService itemService;
  private final CommunityRepository communityRepository;

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

  @GetMapping("items")
  String item(Model model) {
    model.addAttribute("name","바지");
    model.addAttribute("price","15000");
    model.addAttribute("count","100");
    return "list.html";
  }

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
  String writePost(String title, int price) {
    itemService.saveItem(title, price);
    return "redirect:/list";
  }

  @GetMapping("/detail/{id}")
  public String detail(@PathVariable Integer id, Model model) {
    Optional<Item> result = itemRepository.findById(id);
    Item item = result.get();
    model.addAttribute("title", item.getTitle());
    model.addAttribute("price", item.getPrice());
    return "school/class9_24/detail";

  }
}
