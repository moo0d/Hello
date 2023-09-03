package week2_2.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager2 {
    private Map<String, Double> groceryList = new HashMap<>();
    private double total = 0;
    public void addItem(String item, double cost) {
        if (!groceryList.containsKey(item)){
            groceryList.put(item, cost);
        }
        else {
            System.out.println("List contains this item.");
        }
    }
    public void calculateTotalCost() {
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            double cost = entry.getValue();
            total = total + cost;


        }
        System.out.println(" Total cost: " + total);
    }
    public void removeItem(String item){
        if (groceryList.containsKey(item)) {
            System.out.println("Removing \"" + item + "\" from the list...");
            groceryList.remove(item);

        }
        else {
            System.out.println("List doesent contain item.");
        }
    }
    public void displayList() {
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String name = entry.getKey();
            double cost = entry.getValue();
            System.out.println(name + " cost: " + cost);
        }
    }
    public void checkItem(String item) {
        System.out.println("Is \"" + item + "\" in the grocery list? " + groceryList.containsKey(item));

    }

    public static void main(String[] args) {
        GroceryListManager2 manager = new GroceryListManager2();
        manager.addItem("peruna", 5);
        manager.addItem("juusto", 5);
        manager.addItem("jauheliha", 10);
        manager.calculateTotalCost();



    }
}