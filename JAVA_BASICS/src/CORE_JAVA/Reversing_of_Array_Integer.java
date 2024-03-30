package CORE_JAVA;

import java.util.Arrays;

public class Reversing_of_Array_Integer {

	public static void main(String[] args) {
		int[] ages = new int[5];
		
		ages[0]=25;
		ages[1]=33;
		ages[2]=78;
		ages[3]=11;
		ages[4]=99;
	
		for(int i =(ages.length)-1;i>=0;i--) {
			System.out.print(ages[i]+" ");
		}
		System.out.println(" ");
		System.out.println("------------------");
		System.out.println(Arrays.toString(ages));

 }
}

