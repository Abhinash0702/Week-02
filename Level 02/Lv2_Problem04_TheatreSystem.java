class MovieTicket{
    String movieName; 
    int seatNumber; 
    int price; 

    MovieTicket(String movieName){
        this.movieName= movieName;
    }

    // method to book seat with seat number and price
    public void bookSeat(int seatNumber, int price){
        this.seatNumber= seatNumber;
        this.price= price;
    }

    // method to print ticket or give details of ticket
    public void printTicket(){
        System.out.println("Movie Name: "+ this.movieName);
        System.out.println("Seat Number: "+ this.seatNumber);
        System.out.println("Price: "+ this.price);
    }
}

public class Lv2_Problem04_TheatreSystem {

    public static void main(String[] args) {
        MovieTicket mt1= new MovieTicket("The Dark Knight");
        // booking seat with seat number and price
        mt1.bookSeat(101, 200);

        // printing ticket details
        mt1.printTicket();
    }
}