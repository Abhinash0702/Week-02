class Employee{
	String name;
	int id;
	int salary;
	
	//making constructor of the class
	Employee(String name, int id, int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	//method to display the details of the employee
	public void display(){
		System.out.println("Name: "+name+ "\n Id: "+id +"\n salary: "+salary);
	}
}


public class Lv01_problem01_EmployeeDetails{
	public static void main(String args[]){
		
		//making constructor of the Employee class
		Employee person1=new Employee("Abhinash",1,15000);
		
		//calling display method
		person1.display();
	}
}