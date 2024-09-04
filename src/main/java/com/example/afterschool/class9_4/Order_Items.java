package com.example.afterschool.class9_4;

import jakarta.persistence.*;
import lombok.ToString;

@ToString
@Entity
public class Order_Items {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer order_item_id;
  public Integer order_id;
  public Integer product_id;
  public Integer quantity;
  public double price;
}
