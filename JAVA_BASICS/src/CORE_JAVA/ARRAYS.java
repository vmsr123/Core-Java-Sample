package CORE_JAVA;

public class ARRAYS {

	public static void main(String[] args) {
	
		//ARRAY STORES THE SET OF ITEMS IN AN ARRANGED ORDER WITH SAME SAME DATA TYPE with square brackets{}
	String[] players = {"RENAOLDO","MESSI","NAYMER","BENZMAN"};
	
	//DIRECT ASSIGNING THE VALUES TO AN STRING ARRAY
	int[] numbers = {23,11,123,67,99};
	System.out.println(numbers.length);
	//THIS IS THE AARAY OF NUMBERS THAT IS INTRGERS
	
	int[] ages = new int[5];//creation of empty integer array with length
	ages[0]=25;
	ages[1]=33;
	ages[2]=78;
	ages[3]=11;
	ages[4]=99;
	
	System.out.println(players);
	System.out.println(players.length);
	System.out.println(" ");
	System.out.println(ages);
	System.out.println(ages.length);
	System.out.println(" ");
	
	// if we print this is  we get memory address [Ljava.lang.String;@34c45dca we get value through loops only
	
	System.out.println(" ");
	System.out.println(ages[0]);
	System.out.println(ages[1]);
	System.out.println(ages[2]);
	System.out.println(ages[3]);
	System.out.println(ages[4]);
	
	
	for(int i = 0;i<players.length;i++) {
		System.out.println(players[i]);
	}
	
	System.out.println(" ");
	
	for(int i=0;i<ages.length;i++) {
		System.out.println(ages[i]);
	}
	System.out.println(" ");
	
	String[] names = new String[5];//CREATION OF EMPTY STRING ARRAY WITH LENGTH 
	names[0]="madhu";
	names[1]="vasu";
	names[2]="dilip";
	names[3]="vamsi";
	names[4]="chaithu";
	
	for(int i = 0;i<names.length;i++){
		System.out.println(names[i]);
		}
	
	System.out.println(" ");
	
	//HOW TO REVERSE the ARRAY OF STERING
	
	for(int i =((players.length)-1);i>=0;i--) {
		
		System.out.println(players[i]);
	}
	
	
	
	
	}
}
