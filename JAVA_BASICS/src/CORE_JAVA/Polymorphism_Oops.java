package CORE_JAVA;

public class Polymorphism_Oops {

	public static void main(String[] args) {
		/*"POLYMORPHISM":-IS THE PROPERTY BY WHICH OBJECTS BELONGING TO DIFFERENT CLASS ARE ABLE TO 
RESPOND O THE SAME MESSAGE BUT IN DIFFEREN WAYS.
 *AN OBJECT OF A CLASS  CAN BEHAVE DIFFERENTLY WHILE COMUNICATING WITH DIFFERENT OBJECTS
"POLY":-MEANS MANY OR MULTI
"MORPHISM" := FORMS OR SHAPES
THERE ARE TWO TYPES
	1)COMPILE TIME POLYMORPHISM---METHOD OVERLOADING OR CONSTRUCTOR OVERLOADING OR METHOD HIDING
	2)RUN TIME POLYMORPHISM---METHOD OVERRIDING 
*/
		
		
//1)METHOD OVERRIDING---(RUN-TIME POLYMORPHISM)------USING SAME METHOD NAME THAT ARE THERE IN THE DIFFERENT CLASSES
//CHANGEING THE IMPLEMENTATION OF SUPER CLASS METHODS IN  THE SUB CLASS  	
		
// CHILD CLASS HAS THE SAME METHOD AS DECLARED IN THE PARENT CLASS.
		 
	Animal myanimal = new Animal();
	myanimal.makesound();
	
	Dog mydog = new Dog();
	mydog.makesound();
	
	Cat mycat = new Cat();
	mycat.makesound();
	
	}

}

//METHOD OVERRIDING
class Animal{
	public void makesound() {
		System.out.println("ANIMALS MAKE SOUND");
	}
}
class Dog extends Animal{
	public void makesound() {
		System.out.println("BOWW BOWWW  ...!");
	}
}
class Cat extends Animal{
	public void makesound() {
		System.out.println("meow mewo..!");
	}
}


