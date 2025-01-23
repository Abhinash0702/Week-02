import java.util.Scanner;
class PalindromeChecker {
	
    // Attributes 
    String text;

    // Constructor to initialize the attributes of the Account Holder
    PalindromeChecker(String text) {
        this.text = text;
    }
	
	//method to check palindrome
	public boolean checkPalindrome(){ 
		int i=0;int j=text.length()-1;
		
		//counter to count the similarity
		int count=0;
		
		while(i<j){
			if(text.charAt(i)==text.charAt(j)){
				count++;
			}
			i++;j--;
		}
		if(count==text.length()/2){
			return true;
		}
		return false;
	}
	
	
}

public class Lv02_problem03_PalindromeChecker{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//taking input from the user
		System.out.print("Enter the text: ");
		String text=input.nextLine();
		
				
        // Creating an object of the Student class
        PalindromeChecker obj = new PalindromeChecker(text);
		
		boolean result= obj.checkPalindrome();
		
		
		if(result==true){
			System.out.println("Yes the text is palindrome ");
		}
		else{
			System.out.println("It is not a palindrome");
		}
		input.close();
		
    }
}
