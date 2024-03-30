package CORE_JAVA;
import java.util.*;

public class Array_Sorting {

	@Override
	public String toString() {
		return "Array_Sorting [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Array_Sorting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//3RD COMMIT FOR GIT
		int[] ages = new int[5];
		
		ages[0]=25;
		ages[1]=33;
		ages[2]=78;
		ages[3]=11;
		ages[4]=99;
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
		
		System.out.println(" ");
		
	Arrays.sort(ages);
	for(int i=0;i<ages.length;i++) {
		System.out.println(ages[i]);
	}
	
	
	}

}
