package CORE_JAVA;

public class Practiced {
	int a=20;
	static int b=20;

	public static void main(String arg[]) {
		Practiced p1 =new Practiced();
		System.out.println(p1.a);
		System.out.println(p1.b);
		System.out.println(b);
		int c=10;
		switch (c) {
		case 20:
			System.out.println("20");
			break;
		case 21:
			System.out.println("21");
			break;
		default :
			System.out.println("defaukt");
		}
		
	}
}
