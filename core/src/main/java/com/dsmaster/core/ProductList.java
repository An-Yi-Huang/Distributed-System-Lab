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
            // Clothes & Digital
            add(new ProductInfo(20, "Men's Closed Bottom Fleece Sweatpants", 19.00, 201, "Clothes", 300));
            add(new ProductInfo(21, "Baby Girls' Playwear Set", 21.00, 352, "Clothes", 202));
            add(new ProductInfo(22, "Women's Benton Springs Fleece Jacket", 39.00, 423, "Clothes", 30));
            add(new ProductInfo(23, "Yoga Pants for Women", 18.00, 154, "Clothes", 80));
            add(new ProductInfo(24, "Long Sleeve Henley Shirt", 25.00, 271, "Clothes", 50));
            add(new ProductInfo(25, "Button Up Long Sleeve Tops", 45.00, 102, "Clothes", 90));
            add(new ProductInfo(26, "$25 Xbox Gift Card", 25.00, 150, "Digital", 100));
            add(new ProductInfo(27, "Women's Digital Chronograph Resin Strap Watch", 14.00, 75, "Digital", 80));
            add(new ProductInfo(28, "Cordless Phone System", 29.50, 16, "Digital", 70));
            add(new ProductInfo(29, "Wireless in-Ear Headphones (Black)", 158.00, 63, "Digital", 90));
            add(new ProductInfo(30, "Wireless Bluetooth Speaker", 25.99, 24, "Digital", 36));
            //Pet & Beauty
            add(new ProductInfo(41, "Fish Toys Moving Fish Toy for Cat", 10.99, 2345, "pet", 10);
            add(new ProductInfo(42, "Woodbase Cat Litter 30 Litre", 13.98, 2374, "pet", 49);
            add(new ProductInfo(43, "Cat Litter 6 Inlays Tray Liners Dust", 17.00, 350, "pet", 130);
            add(new ProductInfo(44, "PetSafe Drinkwell", 11.98, 389, "pet", 50);
            add(new ProductInfo(45, "large Cat Litter Tray Toilet Box", 32.99, 1661, "pet", 79);
            add(new ProductInfo(46, "Garnier Sheet Masks Self-Care Collection", 12.18, 130, "beauty", 500);
            add(new ProductInfo(47, "Assorted Mix Lip Balm Gift Set", 11.28, 8652, "beauty", 59);
            add(new ProductInfo(48, "Reusable Makeup Remover Pads", 5.99, 9386, "beauty", 459);
            add(new ProductInfo(49, "False Eyelashes", 8.99, 46, "beauty", 390);
            add(new ProductInfo(50, "Jade Roller Gift Set", 16.95, 2890, "beauty", 308);

        }
    };
}
