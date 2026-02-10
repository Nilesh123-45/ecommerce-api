package com.ecommerce.Backend.service;



import com.ecommerce.Backend.entity.Item;
import com.ecommerce.Backend.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item getItemById(Long id) {
        Optional<Item> item = itemRepository.findById(id);
        return item.orElse(null);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}