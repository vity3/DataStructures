package com.company;

import java.util.*;

public class Assignment3HashTable {
    public static void main(String[] args) {
        Hashtable<String, Double> fruits = new Hashtable<>();
        fruits.put("Apple", 0.53);
        fruits.put("Pear", 0.73);
        fruits.put("Grapes", 1.56);
        fruits.put("Orange", 0.91);
        fruits.put("Banana", 0.71);
        fruits.put("Lemon", 0.24);
        fruits.put("Melon", 3.53);
        fruits.put("Watermelon", 4.01);

        System.out.println("");
        System.out.println("Fruits: ");
        for (Map.Entry list : fruits.entrySet()) {
            System.out.println(list.getKey() + ": " + list.getValue());
        }

        int underOneEuro = 0;
        for (Double eachFruit : fruits.values())
            if (eachFruit < 1) {
                underOneEuro++;
            }
        System.out.println("");
        System.out.println("There are " + underOneEuro + " products under 1 eur.");

        double lowestPrice = (Collections.min(fruits.values()));
        double largestPrice = (Collections.max(fruits.values()));
        for (Map.Entry<String, Double> entry : fruits.entrySet()) {
            if (entry.getValue() == lowestPrice) {
                System.out.println(entry.getKey() + " is a fruit with the lowest price: " + lowestPrice + " eur");
            }
            if (entry.getValue() == largestPrice) {
                System.out.println(entry.getKey() + " is a fruit with the largest price: " + largestPrice + " eur");
            }

        }
        HashMap<String, Double> vegetables = new HashMap<>();
        vegetables.put("Pumpkin", 2.53);
        vegetables.put("Courgette", 1.99);
        vegetables.put("Sweet potato", 2.73);
        vegetables.put("Potato", 0.51);
        vegetables.put("Carrot", 0.31);
        vegetables.put("Tomato", 0.62);
        vegetables.put("Cucumber", 0.44);
        vegetables.put("Cauliflower", 2.93);
        vegetables.put("Broccoli", 3.01);

        fruits.putAll(vegetables);
        System.out.println("");
        System.out.println("Fruits and Vegetables: ");
        for (Map.Entry list : fruits.entrySet()) {
            System.out.println(list.getKey() + ": " + list.getValue());
        }
        LinkedHashMap<String, Double> sortedFruits = new LinkedHashMap<>();
        fruits.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedFruits.put(x.getKey(), x.getValue()));
        System.out.println("");
        System.out.println("Fruits and Vegetables in ascending order by price:");
        for (Map.Entry list : sortedFruits.entrySet()) {
            System.out.println(list.getKey() + ": " + list.getValue());
        }

    }

}
