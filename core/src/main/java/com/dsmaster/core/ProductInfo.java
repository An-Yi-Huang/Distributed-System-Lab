package com.dsmaster.core;

import java.io.Serializable;

public class ProductInfo implements Serializable{

    private int id;
    private String name;
    private double price;
    private int sales;
    private String category;
    private int inventory;

    public ProductInfo(){}

    public ProductInfo(int id, String name, double price, int sales, String category, int inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sales = sales;
        this.category = category;
        this.inventory = inventory;
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSales() {
        return this.sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getInventory() {
        return this.inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

}