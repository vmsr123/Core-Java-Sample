package CORE_JAVA;

import java.util.*;

public class Collection_Array_List {
	

	public static void main(String[] args) {
		//THESE ARE ALL COLLECTIONS
		//ARRAY LIST IS NOTHING BUT SIMILAR  LIST IN PYTHON
		//WE CAN ADD OR REMOVE VALUES DYNAMICALLY
		//ARRA LIST IS NOT A SIZE LIMIT
		//BUT ARRAY IS SIZE LIMIT
		
		
/*syntax:-
		ArrayList<datatype> var = new ArrayList<datatype>(); generic way(new way)
		*/
		
		//Creatio of ArrayList
		ArrayList<String>  players = new ArrayList<String>();
		
		
		//WE GET EMPTY ARRAYLIST
		//System.out.println(players);
		
		
		
		//ADD VALUES TO ARRAYLIST
		players.add("ronaldo");
		players.add("messi");
		players.add("bezmen");
		players.add("madhu");
		players.add("reddy");
		System.out.println(players);
		
		//WE WANT TO GET LENGTH OF THE ARRAYLIST BY USING "size()"
		 System.out.println(players.size());
	
		
		
		//SORT THE ARRAYLIST
		 Collections.sort(players);
		 System.out.println(players);
		 
	
		 
		 //REMOVE THE PATICULAR VALUE FROM THE ARRAYLIST
		 players.remove(0);
		 //players.remove("madhu");
		 System.out.println(players);
		 
		 
		 /*
		  
		 //CLEAR ALL THE VALUES
		 players.clear();
		 System.out.println(players);
		 
		 */
		 
		 for(String player:players) {
			 System.out.println(player);
		 }
		 
		 
	
	
//-----------------------------------------------------------------------------------------------------
		 
		 
		 
 // CREATION OF ARRAYLIST WITH INTEGER DATA TYPE
		 
		 ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		 
		 //ADDING VALUES TO THE ARRAYLIST
		 numbers2.add(321);
		 numbers2.add(123);
		 numbers2.add(244);
		 numbers2.add(145);
		 numbers2.add(45);
		 System.out.println(numbers2);
		 
	
	//sorting of INTEGER ARRAYLIST
		 Collections.sort(numbers2);
		 System.out.println(numbers2);
		 
	//
		 
		 
}

}

