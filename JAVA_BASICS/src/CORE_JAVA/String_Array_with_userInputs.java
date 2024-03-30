package CORE_JAVA;

public class String_Array_with_userInputs {

	public static void main(String[] args) {

		String[] names = new String[5];//CREATION OF EMPTY STRING ARRAY WITH LENGTH & SIZE IS MANDATORY TO GIVE THE LENGTH
		names[0]="madhu";
		names[1]="vasu";
		names[2]="dilip";
		names[3]="vamsi";
		names[4]="chaithu";
		
		for(int i = 0;i<names.length;i++){
			System.out.println(names[i]);
			}
	//we want to get each values of index
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
	
	
		System.out.println(" ");
	
/*------------------------------------------------------------------------------------------------------------*/
		
//DIRECT ASSIGNING THE VALUES TO AN STRING ARRAY
		String[] players = {"RENAOLDO","MESSI","NAYMER","BENZMAN"};
				
		

		for(int i = 0;i<players.length;i++) {
			System.out.println(players[i]);
		}
		
		System.out.println(" ");
   // if we print this is  we get memory address [Ljava.lang.String;@34c45dca we get value through loops only
		System.out.println(players);
		System.out.println(players.length);
		System.out.println(" ");
	
	//we want to get each values of index
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
		System.out.println(players[3]);
	
	
	}

}
