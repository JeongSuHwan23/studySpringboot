package com.example.afterschool.class9_4;

import jakarta.persistence.*;
import lombok.ToString;

@ToString
@Entity
public class Orders {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long order_id;
  public Long user_id;
  public String order_date;
  public String total_amount;
  public String status;
}
