package com.railwaybooking.model;

import java.util.HashMap;
import java.util.LinkedList;

public class Routes {
	
	String name;
	Location from;
	Location to;
	int distance;
	
	static HashMap<String,LinkedList<Trains>> availableRoutes = new HashMap<String,LinkedList<Trains>> ();
	
	Routes(String name,Location from, Location to, int distance, Trains express) throws Exception{
		if(distance<0){
			throw new Exception("NegativeDistanceException");
		}
		
		this.name = name;
		this.from = from;
		this.to = to;
		this.distance = distance;
		
		
		
	}
	
	
	
	
	
}
