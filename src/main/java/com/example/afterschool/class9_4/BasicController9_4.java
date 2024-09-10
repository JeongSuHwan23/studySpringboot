package com.example.afterschool.class9_4;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BasicController9_4 {

  private final UsersRepository usersRepository;
  private final com.example.afterschool.class9_4.ProductRepository ProductRepository;
  private final com.example.afterschool.class9_4.OrdersRepository OrdersRepository;
  private final com.example.afterschool.class9_4.Order_ItemsRepository Order_ItemsRepository;
  private final com.example.afterschool.class9_4.ReviewsRepository ReviewsRepository;


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
}