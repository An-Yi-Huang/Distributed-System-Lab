package com.dsmaster.core;

import java.util.List;
import java.util.ArrayList;

public class ProductList {
    public static final List<ProductInfo> PRODUCTS = new ArrayList<ProductInfo>(){
        {
            add(new ProductInfo(0, "Collagen Superdose", 24, 30, "health", 300));
            add(new ProductInfo(1, "Active Iron For Women", 24.99, 100, "health", 500));
            add(new ProductInfo(2, "Pureis Ultra Pure CBD", 30.53, 45, "health", 400));
            add(new ProductInfo(3, "Twinings Inner Peace", 4.49, 10, "health", 100));
            add(new ProductInfo(4, "A.Vogel Immune Support Tablets", 16.99, 35, "health", 120));
            add(new ProductInfo(5, "Jacobs Cream Crackers", 1.99, 200, "food", 1000));
            add(new ProductInfo(6, "Original Breadsticks", 0.69, 29, "food", 205));
            add(new ProductInfo(7, "Weetabix Cereal", 3.99, 49, "food", 140));
            add(new ProductInfo(8, "Flahavans Irish Organic Oatlets Porridge", 2.79, 31, "food", 200));
            add(new ProductInfo(9, "Roma Spaghetti", 2.59, 500, "food", 1200));
        }
    };
}
