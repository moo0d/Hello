package week2_2.Task3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryListManager3 {
    private Map<String, Double> groceryList = new HashMap<>();
    private Map<String, ArrayList<String>> groceryCategory = new HashMap<>();
    private double total = 0;

    public void addItemWithCategory(String item, String category) {
        if (!groceryCategory.containsKey(category)) {
            groceryCategory.put(category, new ArrayList<>());
        }
        groceryCategory.get(category).add(item);

    }
    public void displayByCategory(String category){
        if (groceryCategory.containsKey(category)){
            List<String> itemsIn = groceryCategory.get(category);
            System.out.println("Category \"" + category + "\":");

            for (String itemsInCategory : itemsIn){
                System.out.println(itemsInCategory);
            }
        }
        else {
            System.out.println("Category \""+ category + "\" doesent exist.");
        }

    }
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
       //GroceryListManager3 manager = new GroceryListManager3();
        //manager.addItem("peruna", 5);
        //manager.addItem("juusto", 5);
        //manager.addItem("jauheliha", 10);
        //manager.calculateTotalCost();
        GroceryListManager3 manager = new GroceryListManager3();
        manager.addItemWithCategory("jauheliha", "lihat");
        manager.addItemWithCategory("sisäfilee", "lihat");
        manager.addItemWithCategory("kurkku", "vihannes");
        manager.addItemWithCategory("tomaatti", "vihannes");
        manager.displayByCategory("vihannes");
        manager.displayByCategory("lihat");
        manager.displayByCategory("kotkot");

    }
}