package ru.countrystuff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.countrystuff.model.Item;
import ru.countrystuff.repository.ItemRepository;

import java.util.List;

/**
 * Created by RAMSES on 28.03.2016.
 */
@Service
public class CatalogueService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.getAll();
    }
}
