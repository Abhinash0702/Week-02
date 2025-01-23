class Circle{
	float radius;
	
	//making constructor of the class
	Circle(float radius){
		this.radius=radius;
	}
	
	//method to calculate area of the circle
	public float calculate(){
		float area = (22.0f/7)*(radius); 
		return area;
	}
	
	//method to display the area of circle
	public void display(){
		System.out.println("Area of circle is : "+this.calculate());
	}
}


public class Lv01_problem02_AreaOfCircle{
	public static void main(String args[]){
		
		//making object of Circle class
		Circle one = new Circle(4.5f);
		
		//calling display method
		one.display();
	}
}