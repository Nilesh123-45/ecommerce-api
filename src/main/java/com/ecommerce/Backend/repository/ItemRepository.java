package com.ecommerce.Backend.repository;

import com.ecommerce.Backend.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ItemRepository {

    private final List<Item> items = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public Item save(Item item) {
        item.setId(counter.incrementAndGet());
        items.add(item);
        return item;
    }

    public Optional<Item> findById(Long id) {
        return items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst();
    }

    public List<Item> findAll() {
        return new ArrayList<>(items);
    }
}