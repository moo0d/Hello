package week2_2.Task1;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItem(String item) {
        if (!groceryList.contains(item)){
            groceryList.add(item);
        }
        else {
            System.out.println("List contains this item.");
        }
    }

    public void removeItem(String item){
        if (groceryList.contains(item)) {
            System.out.println("Removing \"" + item + "\" from the list...");
            groceryList.remove(item);

        }
        else {
            System.out.println("List doesent contain item.");
        }
    }
    public void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
        System.out.println(" ");
    }
    public void checkItem(String item) {
        System.out.println("Is \"" + item + "\" in the grocery list? " + groceryList.contains(item));

    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.addItem("peruna");
        manager.addItem("peruna");
        manager.addItem("kala");
        manager.addItem("liha");
        manager.addItem("tomaatti");
        manager.addItem("juusto");

        System.out.println("Grocery list:");
        manager.displayList();
        manager.checkItem("härkä");
        manager.removeItem("kala");
        System.out.println("Updated Grocery list: ");
        manager.displayList();



    }
}