package CORE_JAVA;

public class Inheritance_Ooops {

	public static void main(String[] args) {
		/*
		"INHERITENCE":-THE PROCESS OF DERIVING A NEW CLASS FROM OLD CLASS(PARENT CLASS) IS KNOWN AS INHERITANCE.
THE OLD CLASS IS SUPERCLASS AND THE NEW CLASS IS SUBCLASS 
*INHERENT THE PROPERTIES FROM PARENT CLASS 
		 
		 "SYNTAX":-
		 			class Subclass_name extends Super_class{
		 			methods and fields
		 			}
		 			
		 */
	
		honda features = new honda();
		//IN HONDA CLASS THERE IS NO START()&GEAR() METHOD by using EXTENDS WE get methods from HERO CLASS 
		features.selfigniion();
		features.gear();
		features.start();
		
		//PARENT CLASS 
		hero fea = new hero();
		fea.gear();
		
	
	}

}
//PARENT CLASS OR SUPERCLASS
class hero{
	void start() {
		System.out.println("Starting the bike ");
	}
	
	void gear() {
		System.out.println("Change the gear");
	}
	
	
}
//CHILD CLASS OR SUB CLASS
class honda extends hero{
	void selfigniion() {
		System.out.println("SELF START");
	}
}







