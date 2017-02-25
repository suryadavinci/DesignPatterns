package railwayticketbooking;

import java.util.HashMap;

public class Trains {

	String name;
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		
		map.put(1,"surya");
		//map.put(1, "swathi");
		
		System.out.println(map.get(1));
		
		
	}
	
}
