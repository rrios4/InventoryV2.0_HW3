package com.HW3.InventoryV20.api;

import com.HW3.InventoryV20.model.Item;
import com.HW3.InventoryV20.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

//This is the main controller where the protocols will be used for the Item model I created.
/* Used this video to understand how to add views to a controller for the api
    https://www.youtube.com/watch?v=K7ysc9gPKhQ&list=PLdJYl6XU45uLIHaPBQEj-cEMynAl0oeiz&index=5 */
@Controller
public class InventoryController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String init(HttpServletRequest req) {
        req.setAttribute("items", itemService.findAllItems());
        return "index";
    }

}
