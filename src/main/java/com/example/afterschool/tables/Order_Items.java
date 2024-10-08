package com.example.afterschool.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
