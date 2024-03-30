package CORE_JAVA;

public class Max_And_Min_Value_of_Array {

	public static void main(String[] args) {

		int[] ages = new int[5];
		
		ages[0]=25;
		ages[1]=33;
		ages[2]=78;
		ages[3]=11;
		ages[4]=99;
		
		
		
//  THIS IS FOR MAXIMUM VALUE
		int max=ages[0];
		for(int i =0;i<ages.length;i++) {
			if (ages[i]>max) {
				max=ages[i];	
			}
		}			
		System.out.println(max);

	
		
//  THIS OS FOR MINIMUM VALUE
		int min=ages[0];
		for(int i =0;i<ages.length;i++) {
			if (ages[i]<min) {
				min=ages[i];	
			}
		}	
		System.out.println(min);
	}

}
