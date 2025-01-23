
class Student {
    // Attributes of the MobilePhone class
    String name;
    int rollNo;
    float marks;

    // Constructor to initialize the attributes of the phone
    Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
	
	//method to find the grade
	public char CalculateGrade(){
		if(marks>=75.0){
			return 'A';
		}
		else if(marks <75.0 && marks >=60.0){
			return 'B';
		}
		else if(marks >= 50.0 && marks <=59.0){
			return 'C';
		}
		else if(marks >=40.0 && marks<=49.0){
			return 'D';
		}
		else if(marks >=30.0 && marks <=39.0){
			return 'E';
		}
		return 'F';
	}
	
    // Method to display all the details 
    public void displayDetails() {
        System.out.println("---------------------- STUDENT DETAILS ---------------------");
        System.out.println("Name : " + name+"\n Roll no. : " + rollNo + "\n Total Marks: " +marks);
		System.out.println("Grade : "+this.CalculateGrade());
    }
}

public class Lv02_problem01_StudentGrade{
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student1 = new Student("Abhinash shukla",02,90.4f);

		//calling methods to calculate grade and display info;
        student1.displayDetails();
    }
}
