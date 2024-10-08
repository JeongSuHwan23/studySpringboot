package com.example.school.repository;

import com.example.school.db.Item;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
