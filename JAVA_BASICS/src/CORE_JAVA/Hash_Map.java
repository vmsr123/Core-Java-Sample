package CORE_JAVA;
import java.util.*;

public class Hash_Map {

	public static void main(String[] args) {
		//hash map is similar to Dictonary in python(key-value pairs)
		HashMap<Integer,String>  players = new HashMap<Integer,String>();
		System.out.println(players);
	
		
		//ASSIGN VALUES OR ADD THE KEY-VALUES
		
		players.put(7,"Madhu");
		players.put(1, "REDDY");
		players.put(2, "vasu");
		players.put(3,"dilip");
	
	
		System.out.println(players);
		
		//REMOVE THE data
		
		players.remove(7);// IT WILL REMOVE THE KEY 7
		System.out.println(players);
		
		players.put(9,"sudan");
	    System.out.println(	players.keySet());
		System.out.println( players.values());
	System.out.println(players.containsKey(2));
	System.out.println(players.entrySet());
		
		
		
	}

}
