package com.example.afterschool.class9_4;

import jakarta.persistence.*;
import lombok.ToString;

@ToString
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long product_id;
  public String product_name;
  public String description;
  public Double price;
  public Integer stock_quantity;

}
