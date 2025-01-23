// Item class with attributes, method to display item details and calculate total cost
class Item {
    // Attributes of the class
    int itemCode;
    String itemName;
    double price;

    // Constructor to initialize the item details
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code : " + itemCode+ "\n Item Name : " + itemName +"\n Item Price : "+price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Lv01_problem04_TrackInventory {
    public static void main(String[] args) {
        // Creating an object of Item class 
        Item item1 = new Item(101, "Laptop", 500.00);

        // Displaying item details
        item1.displayItemDetails();

        // Calculating and displaying the total cost for a given quantity (e.g., 3 items)
        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: " + totalCost);
    }
}
