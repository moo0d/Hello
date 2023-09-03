package week2_2.Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingList {

    private Map<String, ArrayList<String>> shoppingList = new HashMap<>();

    public void addToShoppingList(String item, String category) {
        if (!shoppingList.containsKey(category)) {
            shoppingList.put(category, new ArrayList<>());
        }
        shoppingList.get(category).add(item);
    }
        public void removeFromShoppingList (String item){
            if (shoppingList.containsKey(item)) {
                shoppingList.remove(item);
            }
            else {
                System.out.println("List doesent contain item.");
            }

        }
    public void displayShoppingList(String category) {
        if (shoppingList.containsKey(category)) {
            List<String> itemsIn = shoppingList.get(category);
            System.out.println("Category \"" + category + "\":");

            for (String itemsInCategory : itemsIn) {
                System.out.println(itemsInCategory);
            }
        } else {
            System.out.println("Category \"" + category + "\" doesent exist.");
        }

    }

        public static void main (String[]args){
            ShoppingList shopList = new ShoppingList();
            GroceryListManager5 groList = new GroceryListManager5();
            shopList.addToShoppingList("grilli", "Weekend BBQ");
            shopList.addToShoppingList("makkara", "Weekend BBQ");
            shopList.displayShoppingList("Weekend BBQ");
            groList.addItemWithQuantity("grilli", 1);
            groList.addItemWithQuantity("makkara", 10);
            groList.displayAvalaibleItems();
            groList.addItem("grilli", 200);
            groList.addItem("makkara", 20);
            groList.displayList();
            groList.calculateTotalCost();

        }
    }
