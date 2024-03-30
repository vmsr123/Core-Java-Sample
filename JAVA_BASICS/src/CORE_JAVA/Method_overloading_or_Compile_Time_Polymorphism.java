package CORE_JAVA;

public class Method_overloading_or_Compile_Time_Polymorphism {

	public static void main(String[] args) {
		/*"METHODOVERLOADING" OR "COMPILE TIME POLYMORPHISM" :-MULTIPLE METHODS WIH SAME NAME AND SAME CLASS BUT
DIFFERENT PARAMETERS 
		 
	*/
		
	//SAME METHOD NAME WITH DIFFERENT ARGUMENTS IS CALLED COMPILE TIME POLYMORPHISM 
	// CONSTRUCTOR OVERLOADING
	//METHOD HIDING
		Addition add = new Addition();
		System.out.println(add.addnum(12,12));
		System.out.println(add.addnum(12,12,12));
		System.out.println(add.addnum(12.788,121.4556));
	
	}

}
class Addition{
	public int addnum(int a,int b) {
		return a+b;
	}
	public int addnum(int a,int b,int c){
		return a+b+c;
	}
	public double addnum(double a,double b) {
		
		return a+b;
	}
	
	
	
	
}
