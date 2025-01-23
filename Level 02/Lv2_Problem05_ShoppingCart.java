class CartItem{
    String itemName; 
    int quantity=0;
    int price;
    
    // constructor to initialize the item in cart and adding one quantity
    CartItem(String itemName , int price, int quantity){
        this.itemName= itemName;
        this.price= price;
        this.quantity=1;
    }

    // method to add one item
    public void addOne(){
        this.quantity++;
    }

    // method to remove one item
    public void removeOne(){
        this.quantity--;
    }

    // printing total money to pay for item
    public void totalPrice(){
        System.out.println("Total Price: "+ this.price*this.quantity);
    }
}

public class Lv2_Problem05_ShoppingCart {

    public static void main(String[] args) {

        // creating object of CartItem class, and it will by default add one item
        CartItem ci1= new CartItem("Shirt", 500, 1);

        // adding, removing and calculating total price
        ci1.addOne();
        ci1.addOne();
        ci1.removeOne();
        ci1.totalPrice();
    }
}