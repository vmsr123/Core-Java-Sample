package CORE_JAVA;

public class Creation_of_Objects_Arrays {

	public static void main(String[] args) {
		
		Bike myBike = new Bike(12000,"HERO");
		System.out.println(myBike.name);
		System.out.println(" ");
//System.out.println(myBike.price); it get error because price is private variable 
		
	//CREATION OF ARRAY OBJECTS
		String[] player =new String[5];
		player[0]="Ronalda";
		player[1]="messi";
		player[2]="neymar";
		player[3]="mbappe";
		player[4]="BEZMEN";
		
	//ARRAY MEANS DATATYPE[] VARIABLE_NAME = NEW DATATYPE[SIZE]; BELOW BIKE[] IS DATATYPE & VAR IS MYBIKELIST	
	Bike[] mybikelist = new Bike[3];
	mybikelist[0]= new Bike(12500,"HONDA");
	mybikelist[1]= new Bike(25000,"KAWASAKI");
	mybikelist[2]=new Bike (24310,"YAMAHA");
	
	//WE GET ADDRESS
	System.out.println(mybikelist);
	System.out.println(mybikelist[1]);
	System.out.println(" ");
	
	//WE GET THE VALUES
	System.out.println(mybikelist[1].name);
	System.out.println(mybikelist[0].name);
	System.out.println(mybikelist[2].name);
	System.out.println(" ");
	
	
	for(int i= 0;i<mybikelist.length;i++) {
		System.out.println(mybikelist[i].name);
	}
	
	
	System.out.println(" ");
	mybikelist[0].display();
	mybikelist[1].display();
	mybikelist[2].display();
	}
	
	

}
class Bike{
	private int price;
	public String name;
	
	public Bike(int p,String n){
		price=p;
		name=n;
	}
	
	void display() {
		System.out.println(price);
		System.out.println(name);
	}
	
	
	
}