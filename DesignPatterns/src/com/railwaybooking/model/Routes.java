package com.railwaybooking.model;

public class Routes {
	
	String name;
	String from;
	String to;
	int distance;
	
	
	
	Routes(String name,String from, String to, int distance, Trains express) throws Exception{
		if(distance<0){
			throw new Exception("NegativeDistanceException");
		}
		
		this.name = name;
		this.from = from;
		this.to = to;
		this.distance = distance;
	}
	
	
	
	
	
}
