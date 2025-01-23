import java.util.Scanner;
class BankAccount {
	Scanner input=new Scanner(System.in);
	
    // Attributes of the BankAccount class
    String accountHolder;
    long accountNumber;
    double balance;

    // Constructor to initialize the attributes of the Account Holder
    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
	
	//method to deposit money
	public void depositMoney(){
		System.out.print("Enter the amount to deposit: ");
		double amount=input.nextDouble();
		
		balance+=amount;
		System.out.println("-------- Amount Added Successfully--------");
		this.displayBalance();
	}
	
	//method to display balance
	public void displayBalance(){
		System.out.println("Current Balance: "+this.balance);
	}
	
    // Method to Withdraw money
    public void withdrawMoney() {
		double amount;
		if (balance >=100){
			System.out.print("Enter the amount :");
			amount=input.nextInt();
			balance-=amount;
			System.out.println("-------THANKYOU-------");
			System.out.println("Your balance: ");
			displayBalance();
		}
		else{
			System.out.println("Amount is insufficient to withdraw");
		}
    }
}

public class Lv02_problem02_Bank{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//taking input from the user
		System.out.print("Enter your name: ");
		String name=input.nextLine();
		System.out.print("Enter your Account Number : ");
		long accountNumber=input.nextLong();
		
		double balance=1523.23;
		
        // Creating an object of the Student class
        BankAccount account1 = new BankAccount(name,accountNumber,balance);
		
		while(true){
			System.out.println("Which service you want to access");
			System.out.println("1. Check Balance \n 2. Deposit Money \n 3. Withdraw Money");
			System.out.println("Press the key -> (1 / 2 / 3)");
			int choice=input.nextInt();
			
			//calling methods based on the choice
			if(choice==1){
				account1.displayBalance();
			}
			else if(choice==2){
				
				account1.depositMoney();
			}
			else{
				account1.withdrawMoney();
			}
			
			System.out.println("Go to Home page (press -> 1) || Exit  (press -> 0) ");
			int decision=input.nextInt();
			if(decision==0){
				break;
			}
			
		}
		
    }
}
