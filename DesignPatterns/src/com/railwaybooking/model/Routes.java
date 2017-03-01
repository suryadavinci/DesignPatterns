package com.railwaybooking.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Routes {
	
	
	String name;
	Location from;
	Location to;
	int distance;
	Trains train;
	private static HashMap<String,Routes> availableRoutes= new HashMap<String,Routes>();
	public static Routes r= new Routes();
	
	//static HashMap<Routes,LinkedList<Trains>> availableExpRoutes = new HashMap<Routes,LinkedList<Trains>> ();
	Routes()
	{
		Location from= Location.availableLocations.get(0);
		Location to= Location.availableLocations.get(1);
		Trains train= ChennaiExpress.cXB;
		try{
		new Routes("CHNTOBANG",from,to,172, train );
		to= Location.availableLocations.get(2);
		
		train= ChennaiExpress.cXB;
		new Routes("CHNTOMUM",from,to,472, train );
		
		train=MumbaiExpress.mXB;
		from= Location.availableLocations.get(1);
		new Routes("BANGTOMUM",from, to,300,train);}catch(Exception e){
			
		}
		
	}
	
	
	
	Routes(String name,Location from, Location to, int distance, Trains express) throws Exception{
		if(distance<0){
			throw new Exception("NegativeDistanceException");
		}
		
		this.name = name;
		this.from = from;
		this.to = to;
		this.distance = distance;
		
		String routeString=from.getShortName()+"TO"+to.getShortName();
		System.out.println("putting route "+routeString);
		
		availableRoutes.put(routeString,this);
		
	}
	
	Routes(int x){
		
	}
	
	public static Routes getRoute(String routeString){
		return availableRoutes.get(routeString);
		
	}
	
	
	public Trains getTrain(){
		return this.train;
	}
	
	
}
