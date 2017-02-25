package railwayticketbooking;

import java.util.ArrayList;
import java.util.HashMap;

public class Destination {

	private static HashMap<String,Destination> allAvailableDestinations=new HashMap<String,Destination>(); 
	private String name;
	
	Destination(String name){
		this.name=name;
	}
	
	

}
