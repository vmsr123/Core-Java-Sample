package CORE_JAVA;

public class Find_Array_Average {

	public static void main(String[] args) {
		int[] ages = new int[5];
		
		ages[0]=25;
		ages[1]=33;
		ages[2]=78;
		ages[3]=11;
		ages[4]=99;
	int total=0;
	for(int i =0;i<ages.length;i++) {
		total +=ages[i];
	}
	
	System.out.println(total);
	
	System.out.println(total/ages.length);
	
	}

}
