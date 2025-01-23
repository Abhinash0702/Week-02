
class MobilePhone {
    // Attributes of the MobilePhone class
    String brand;
    String model;
    double price;

    // Constructor to initialize the attributes of the phone
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all the details of the mobile phone
    public void displayPhoneDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand+"\n Model: " + model+ "\n Price: $" + price);
    }
}

public class Lv01_problem05_MobilePhoneDetails {
    public static void main(String[] args) {
        // Creating an object of the MobilePhone class
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 999.99);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S22", 799.99);

        // Displaying details of both phones
        phone1.displayPhoneDetails();
        System.out.println(); // Blank line for separation
        phone2.displayPhoneDetails();
    }
}
