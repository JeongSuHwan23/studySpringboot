package com.example.afterschool.repository;

import com.example.afterschool.tables.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}