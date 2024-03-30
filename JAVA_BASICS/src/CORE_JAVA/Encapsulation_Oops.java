package CORE_JAVA;

public class Encapsulation_Oops {

	public static void main(String[] args) {
		/*  "ENCAPSULATION ":- USED TO RESRICT ACCESS TO METHODS AND VARIABLES.THE CODE AND DATA ARE
ENCLOSED WITHIN A SINGLE UNIT,JUST LIKE A CAPSULE,FROM BEING MODIFRIED BY EXTERNAL AGENTS.*/
//IT'S LIKE PROTECTION OR RESTRICTION TO THE MEMBERS OF THE CLASS
		
	Cycle onecycle = new Cycle(1200,"green");	
		System.out.println((onecycle.name));
		//System.out.println(onecycle.price);IT WILL GET ERROR WHY MEANS IT'S PRIVATE TO Cycle CLASS
		//ONLY WE ACCESS PRIVATE VARIABLE OR METHODS ON THAT CLASS ITSELF, OUTSIDE WE WON'T GET 
		//IF WE WANT ACCESS THE PRIVATE VARIABLES WE NEED TO CREATE A GETMETHOD INSIDE THE Cycle CLASS
		
		System.out.println(onecycle.getprice());//WE GET PRIVATE VAR BY USING PUBLIC GETMETHOD
		
		//IF WE WANT TO CHANGE THE PRICE OF CYCLE WE USE SETTER FUMCTION OR METHOD
		onecycle.setprice(1600);
		System.out.println(onecycle.getprice());
		
		
	}

}
class Cycle{
	private int price;
	public String name;
	
	public Cycle(int p,String n) {
		price=p;
		name=n;
	}
	
	//getter and setter are methods of class to get ACCESS TO PRIVATE VARIABLES and "we can access outside too"
	
	public int getprice() {
		return price;
	}
	
	public void setprice(int newprice) {//IF WE WANT TO CHANGE THE PRIVATE VARIABLE VALUE
		price=newprice;
		
	}
	
}
