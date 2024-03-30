package CORE_JAVA;

public class Int_Array_with_decleared_values {

	public static void main(String[] args) {
//  "THIS IS THE AARAY OF INTRGERS WITH DECLERATION"
		int[] numbers = {23,11,123,67,99};
		
// if we print this is  we get memory address [Ljava.lang.String;@34c45dca we get value through loops only
		
		System.out.println(numbers);
		
		
		System.out.println(numbers.length);
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		
		//we want to get each values of index
		System.out.println(" ");
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		
		
		
		
		
		
		
//"CREATION OF EMPTY INTEGERS ARRAYS WITH LENGTH"	
		
		int[] ages = new int[5];
		
		ages[0]=25;
		ages[1]=33;
		ages[2]=78;
		ages[3]=11;
		ages[4]=99;
		
		System.out.println(ages);
		System.out.println(ages.length);
		System.out.println(" ");
		
		// if we print this is  we get memory address [Ljava.lang.String;@34c45dca we get value through loops only
		

	
		System.out.println(" ");
		
		for(int j=0;j<ages.length;j++) {
			System.out.println(ages[j]);
		}
		//we want to get each values of index
		System.out.println(" ");
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		System.out.println(ages[4]);
	}

}
}
