package CORE_JAVA;

public class LOOPS {

	public static void main(String[] args) {
		int i = 0;
		int a = 100;
	while(i<=a) {
		System.out.println(i); //IT WILL GO TO NEXTLINE
		i++;
	}
	
	System.out.println(" ");
	System.out.println(" ");
	for(int s=0;s<=a;s++) {
		System.out.print(s+" ");//HERE WE ARE USING PRINT IN SAME LINE
		
	}
	System.out.println(" ");
	System.out.println(" ");
	int z=0;
	do{
		System.out.println(z);//EVEN IF THE CONDITION IS FALSE IT WILL EXECUTE ONE TIME
		z++;
	}while(z<=a);
	
}
}
