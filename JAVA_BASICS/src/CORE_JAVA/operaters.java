package CORE_JAVA;

public class operaters {

	public static void main(String[] args) {
		int a = 123;
		float b =12.5f;
		int z = 203;
		int u= 12;
		String name = "madhu";
		
		System.out.println(a+b);
		System.out.println(b+z);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(b%z);
		System.out.println(z%b);
		System.out.println(a/z);
		System.out.println(z/b);
		System.out.println(z+ name);
		System.out.println(a>b);
		System.out.println(z<b);
		System.out.println(a!=b);
		System.out.println(a==b);
		System.out.println(z!=b);
		System.out.println(b>a && z<a || a==u);
		System.out.println((a/u)); //HERE WE GET ONLY INT PART
		double g = 123d;
		double l=12d;
		System.out.println(g/l);//HERE WE GET AFTER CONVERTION OF DOUBLE WE GET EXACT PRICISE VALUE
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println(z--);
		System.out.println(z);
		System.out.println(++z);
		System.out.println(z);
	}

}
