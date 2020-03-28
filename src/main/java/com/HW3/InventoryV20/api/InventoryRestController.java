package com.HW3.InventoryV20.api;

import com.HW3.InventoryV20.model.Item;
import com.HW3.InventoryV20.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

//This is the rest controller that is able to display raw data without the need of a external file
@RestController
public class InventoryRestController {

    @Autowired
    private ItemService itemService;
    //What getMapping does is that it defines the URL of the hello() function which will return Hello World once there.
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/inventorydb")
    public Collection<Item> getAllItems() {
        return itemService.findAllItems();


    };
}
