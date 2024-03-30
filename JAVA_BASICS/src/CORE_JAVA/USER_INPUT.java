package CORE_JAVA;
import java.util.Scanner;

public class USER_INPUT {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE INT");
		int age = input.nextInt();
		System.out.println("ENTER THE FLOAT");
		float avg = input.nextFloat();
		//ONE METHOD USING NEXTLINE
		input.nextLine();
		System.out.println("ENTER THE STRING");
		String letter = input.nextLine();
		
		
		//SECOND METHOD USING ONLY NEXT is like only string inputs there means we use String letterS = input.next(); 
		System.out.println("ENTER THE STRING");
		String letterS = input.nextLine();
		
		
		//ANOTHER METHOD ALL IS CONVERTED INTO STRING TO ANY(int,double,float)
		System.out.println("ENTER THE AGES");
		int agess =Integer.parseInt(input.nextLine());
		System.out.println("ENTER THE FLOATAVGS");
		float avgs = Float.parseFloat(input.nextLine());
		
		System.out.println("LETTER "+letter);
		System.out.println("LETTER "+letterS);
		System.out.println(age);
		System.out.println(agess);
		System.out.println(avgs);
		System.out.println(avg);
	}

}
