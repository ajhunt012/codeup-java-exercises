import java.util.ArrayList;
import java.util.Scanner;

// Create a class for the grocery item
class GroceryItem {
    protected String category;
    protected String name;
    protected int quantity;

    public GroceryItem(String category, String name, int quantity) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Create a class for the grocery list
class GroceryList {
    private final ArrayList<GroceryItem> items;

    public GroceryList() {
        items = new ArrayList<>();
    }

    // Method to add a new item to the list
    public void addItem(String category, String name, int quantity) {
        items.add(new GroceryItem(category, name, quantity));
    }

    // Method to finalize the list
    public void finalizeList() {
        items.sort((item1, item2) -> {
            int cmp = item1.getCategory().compareTo(item2.getCategory());
            if (cmp == 0) {
                cmp = item1.getName().compareTo(item2.getName());
            }
            return cmp;
        });
    }

    // display the list
    public void display(String category) {
        for (GroceryItem item : items) {
            if (category == null || category.equals(item.getCategory())) {
                System.out.println(item.getCategory() + ": " + item.getName() + " (" + item.getQuantity() + ")");
            }
        }
    }

    // Method to edit an item in the list
    public void editItem(String name, String newCategory, String newName, int newQuantity) {
        for (GroceryItem item : items) {
            if (item.getName().equals(name)) {
                if (newCategory != null) {
                    item.category = newCategory;
                }
                if (newName != null) {
                    item.name = newName;
                }
                if (newQuantity > 0) {
                    item.quantity = newQuantity;
                }
            }
        }
    }
}

