package CORE_JAVA;
public class Constructor {

	public static void main(String[] args) {
/* "CONSTRUCTOR":-WE ARE PASSING THE VALUES DIRECTLY WHEN CREATING AN OBJECT WITHOUT 
 CREATING A SEPARATE  METHOD FOR INSERTING DATA	*/	
		
// IT INITALIZE ALL THE VALUES IN CONSTRUCTOR METHOD WITH SAME CLASS NAME 
	
		//HERE WE GAVE THE AURGUMENTS INSIDE THE CLASS
		
		//AT THE TIME OF CREATION ITSELF WE PASS THE VALUES
		

		// constructor with aurguments passing object itself
		tataCar firstCar = new tataCar(1250000,"BLACK"); 
		
		//BEFORE object creation means  Car firstCar = new Car() -- no aurguments
		firstCar.display();
		
		
		tataCar secondCar = new tataCar(2500000,"BLUE");
		secondCar.display();
	
		tataCar thirdCar = new tataCar(231000,"GREEN");
		thirdCar.display();
	}

}

class tataCar{
	
	private int price;
	public String color;
	
	
	
	//THIS IS CONSTRUCTOR METHOD WITH SAME CLASS NAME
	//HERE WE GIVE DIRECT AURGUMENTS IN CONSTRUCTOR METHOD 
	public tataCar(int p ,String c) {
		price=p;
		color=c;
	}
	
	
	void display() {
		System.out.println(price);
		System.out.println(color);
	}
}

