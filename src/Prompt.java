import java.util.Scanner;
// To work with GroceryItem.java

public class Prompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();

        // Prompt the user if they want to create a grocery list
        System.out.print("Would you like to create a grocery list? (yes/no) ");
        String response = scanner.nextLine();
        if (response.toLowerCase().equals("yes")) {
            // Prompt the user if they want to add a new item
            System.out.print("Would you like to add a new item? (yes/no) ");
            response = scanner.nextLine();
            while (response.toLowerCase().equals("yes")) {
                // Display the categories
                System.out.println("Categories:");
                System.out.println("1. Dairy");
                System.out.println("2. Meat");
                System.out.println("3. Produce");
                System.out.println("4. Baked goods");
                System.out.println("5. Other");
                // Prompt the user to select a category
                System.out.print("Select a category: ");
                String category = scanner.nextLine();
                // Map the user input to a category string
                if (category.equals("1")) {
                    category = "Dairy";
                } else if (category.equals("2")) {
                    category = "Meat";
                } else if (category.equals("3")) {
                    category = "Produce";
                } else if (category.equals("4")) {
                    category = "Baked goods";
                } else if (category.equals("5")) {
                    category = "Other";
                } else {
                    System.out.println("Invalid category");
                    continue;
                }
                System.out.print("Enter the name of the item: ");
                String name = scanner.nextLine();
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                // Add the item to the list
                groceryList.addItem(category, name, quantity);
                // Prompt the user if they want to add another item
                System.out.print("Would you like to add another item? (yes/no) ");
                response = scanner.nextLine();
            }

// Finalize the list
            groceryList.finalizeList();

// Display the list
            System.out.println("\nGrocery list:");
            groceryList.display(null);

// Prompt the user if they want to filter the list by category
            System.out.print("\nWould you like to filter the list by category? (yes/no) ");
            response = scanner.nextLine();
            if (response.toLowerCase().equals("yes")) {
                // Prompt the user to enter a category
                System.out.print("Enter a category: ");
                String category = scanner.nextLine();
                // Display the filtered list
                System.out.println("\nGrocery list:");
                groceryList.display(category);
            }

// Prompt the user if they want to edit an item in the list
            System.out.print("\nWould you like to edit an item in the list? (yes/no) ");
            response = scanner.nextLine();
            if (response.toLowerCase().equals("yes")) {
                // Prompt the user to enter the name of the item
                System.out.print("Enter the name of the item: ");
                String name = scanner.nextLine();
                // Prompt the user to enter the new category (optional)
                System.out.print("Enter the new category (optional): ");
                String newCategory = scanner.nextLine();
                if (newCategory.equals("")) {
                    newCategory = null;
                }
                // Prompt the user to enter the new name (optional)
                System.out.print("Enter the new name (optional): ");
                String newName = scanner.nextLine();
                if (newName.equals("")) {
                    newName = null;
                }
                // Prompt the user to enter the new quantity (optional)
                System.out.print("Enter the new quantity (optional): ");
                int newQuantity = scanner.nextInt();
                if (newQuantity <= 0) {
                    newQuantity = -1;
                }
                // Edit the item in the list
                groceryList.editItem(name, newCategory, newName, newQuantity);
                // Display the updated list
                System.out.println("\nGrocery list:");
                groceryList.display(null);
            }
        }
    }
}
