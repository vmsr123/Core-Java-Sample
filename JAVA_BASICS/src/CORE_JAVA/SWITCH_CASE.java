package CORE_JAVA;

public class SWITCH_CASE {

	public static void main(String[] args) {
		int e=22;
		
		switch(e) {
		case 1:
		
			System.out.println("value is 1");
			break;
		case 2:
			System.out.println("valu is 2");
			break;
		case 22:
			if(e%2 == 0) {
				
				System.out.println("value is 21");
				break;
			}
			
			
		default:
			System.out.println("not in this");
		
		}
	}

}
