package com.dsmaster.core;

import java.util.List;
import java.util.ArrayList;

public class ProductList {
    public static final List<ProductInfo> PRODUCTS = new ArrayList<ProductInfo>(){
        {
            // health & food
            add(new ProductInfo(0, "Collagen Superdose", 24, 30, "health", 300));
            add(new ProductInfo(1, "Active Iron For Women", 24.99, 100, "health", 500));
            add(new ProductInfo(2, "Pureis Ultra Pure CBD", 30.53, 45, "health", 400));
            add(new ProductInfo(3, "Twinings Inner Peace", 4.49, 10, "health", 100));
            add(new ProductInfo(4, "A.Vogel Immune Support Tablets", 16.99, 35, "health", 120));
            add(new ProductInfo(5, "Jacobs Cream Crackers", 1.99, 200, "food", 1000));
            add(new ProductInfo(6, "Original Breadsticks", 0.69, 29, "food", 205));
            add(new ProductInfo(7, "Weetabix Cereal", 3.99, 49, "food", 140));
            add(new ProductInfo(8, "Flahavans Irish Organic Oatlets Porridge", 2.79, 31, "food", 200));
            // Kitchenware & Alcohol
            add(new ProductInfo(10, "Stainless Steel 18cm Small Saucepan", 37.00, 1233, "Kitchenware ", 3000));
            add(new ProductInfo(11, "Cast Aluminium 5L Casserole Dish", 67.00, 323, "Kitchenware ", 600));
            add(new ProductInfo(12, "Nord Drinks Cabinet", 669.00, 132, "Kitchenware ", 500));
            add(new ProductInfo(13, "Cast Aluminium Griddle Pan", 34.00, 830, "Kitchenware ", 3000));
            add(new ProductInfo(14, "Padstow Tall Barstool", 103.20, 245, "Kitchenware ", 500));
            add(new ProductInfo(15, "Vodka 1L", 15.38, 648, "Alcohol", 352));
            add(new ProductInfo(16, "Napoleon Brandy 1L", 16.00, 130, "Alcohol", 370));
            add(new ProductInfo(17, "Gordons Gin 1L", 35.00, 423, "Alcohol", 800));
            add(new ProductInfo(18, "Jameson Irish Whiskey 1L", 43.00, 673, "Alcohol", 827));
            add(new ProductInfo(19, "Baileys Original Irish Cream Liqueur 1L", 28.00, 324, "Alcohol", 676));
        }
    };
}
