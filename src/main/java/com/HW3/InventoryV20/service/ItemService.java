package com.HW3.InventoryV20.service;

import com.HW3.InventoryV20.dao.ItemRepo;
import com.HW3.InventoryV20.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ItemService {

    @Autowired //Tells the spring framework should have to create the object of this type from the ItemRepo
    private ItemRepo itemRepo;

    public Collection<Item> findAllItems(){
        List<Item> items = new ArrayList<Item>();
        for (Item item : itemRepo.findAll()){
            items.add(item);
        }
        return items;
    }

}
