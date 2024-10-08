package com.example.school.service;

import com.example.school.db.Item;
import com.example.school.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//ItemService.java
@Service
@RequiredArgsConstructor
public class ItemService {
  private final ItemRepository itemRepository;

  public void saveItem(String title, Integer price){
    Item item = new Item();
    item.setTitle(title);
    item.setPrice(price);
    itemRepository.save(item);
  }
}