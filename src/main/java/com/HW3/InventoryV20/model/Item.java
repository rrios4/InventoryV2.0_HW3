package com.HW3.InventoryV20.model;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "inventory_table") //They that this class is an entity from the database
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //randomly generates an id
    private int id;
    @Column(name = "name") //provides the name of the column from the data
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "color")
    private String color;
    @Column(name = "qty")
    private int qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
