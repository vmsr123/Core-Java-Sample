package CORE_JAVA;

public class Reverse_of_array {

	public static void main(String[] args) {
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
		
//HOW TO REVERSE the ARRAY OF STRINGS
		
		for(int i =((names.length)-1);i>=0;i--) {
			
			System.out.println(names[i]);
	
		}
	

	
	}
}



