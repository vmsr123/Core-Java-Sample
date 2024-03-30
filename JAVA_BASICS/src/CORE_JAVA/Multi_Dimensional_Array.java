package CORE_JAVA;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {
		int[][] mynumbers = {{1,2,3},{4,5,6},{7,8,9}};
		
	//THESE WE RUN MEANS WE GET THE ADDRESS [I@34c45dca LIKE THIS
		System.out.println(mynumbers[0]);
		System.out.println(mynumbers[1]);
		System.out.println(mynumbers[2]);
	//ACCESS OF VALUES WE GET
		System.out.println(mynumbers[0][0]);
		System.out.println(mynumbers[0][2]);
		System.out.println(mynumbers[1][1]);
		System.out.println(mynumbers[2][0]);
		System.out.println(mynumbers[2][2]);
		
		System.out.println(" ");
		System.out.println(" ");
		for(int i =0;i<mynumbers.length;i++) {
			for (int j =0;j<mynumbers[i].length;j++) {
				System.out.print(mynumbers[i][j]);//we get like matrix structure
				System.out.println(" ");
				
				//System.out.println(mynumbers[i][j]);//we get like normal way
			
			}
			System.out.println("");
		}
	}
}
