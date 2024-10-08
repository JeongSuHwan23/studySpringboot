package com.example.afterschool.repository;

import com.example.afterschool.tables.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
