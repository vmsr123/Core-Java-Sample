package CORE_JAVA;

public class Class_Objects {

	public static void main(String[] args) {
		
		
		
// "CLASS" IS BLUE PRINT OF OBJECTS 
//"STATIC" MEANS NO NEED TO CRATE AN OBJECT WE DIRECTLY CALL OUTSIDE
//"NON-STATIC" MEANS WE  NEED TO CRATE AN OBJECT IN MAIN METHOD

		
		
	//THIS IS HOW TO CREATE AN OBJECT FOR CLASS Car
	//WE CAN CREATE N NO-OF OBJECTS TO THE CLASS
		
		
		//1ST OBJECT CREATION or CURRENT INSTANCE
		
		Car firstCar = new Car(); 
		firstCar.insertdata(125000, "BLACK");
		firstCar.display();
		
		//2ND OBJECT CREATION 
		
		Car secondCar = new Car();
		secondCar.insertdata(1900000,"RED");
		secondCar.display();
		
		
		//3RD OBJECT CREATION
		
		Car thirdCar = new Car();
		thirdCar.insertdata(2000000,"PURPULE");
		thirdCar.display();
		
		
		//CALLING ADDNUMBERS()
		
		int returnvalue = firstCar.addnumbers(120,450);
		System.out.println(returnvalue);
		
		
	}

}

class Car{
	private int price; //WE WON'T USE OUTSIDE THE CLASS ACCESS ONLY THAT CLASS
	public String color; //WE ACCESS ANY WHERE 

	 // IN THIS METHOD VOID MEANS IT  RETURN NOTHING AND NO RETURN STATEMENT
	
	void display() { 
		System.out.println(price);
		System.out.println(color);
	}
	
	void insertdata(int p ,String c) {
		price=p;
		color=c;
	}
	
	
	//IN THIS METHOD RETURN THE INTEGER 
	
	int addnumbers(int firstvalue ,int secondvalue) {
		int sum =firstvalue+secondvalue;
		return sum;
	}
	
	
	
	
}
