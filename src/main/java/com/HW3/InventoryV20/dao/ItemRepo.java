package com.HW3.InventoryV20.dao;

import com.HW3.InventoryV20.model.Item;
import org.springframework.data.repository.CrudRepository;

/*Adding the repo into a dao package is done for having a distinct file structure. I used this video to understand how the repo works with the model
https://www.youtube.com/watch?v=YMWV4aVHT5w&list=PLdJYl6XU45uLIHaPBQEj-cEMynAl0oeiz&index=7   */
public interface ItemRepo extends CrudRepository<Item, Integer> {
}
