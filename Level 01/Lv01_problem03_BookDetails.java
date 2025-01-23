import java.util.*;

class Book{
	String author;
	String title;
	float price;
	
	//making constructor of the class
	Book(String author,String title, float price){
		this.author=author;
		this.title=title;
		this.price=price;
	}
	
	
	//method to display the details
	public void display(){
		System.out.println("Author : "+author+"\n Title : "+title+"\n Price : "+price);
	}
}


public class Lv01_problem03_BookDetails{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter Author name");
		String author= input.nextLine();
		
		System.out.println("Enter Title of the book");
		String title= input.nextLine();
		
		System.out.println("Enter price of the book");
		int price= input.nextInt();
		
		//making object of Class Book
		Book book1 = new Book(author,title, price);
		
		//calling display method
		book1.display();
	}
}