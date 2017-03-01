package com.railwaybooking.model;

import java.util.ArrayList;

public class Location {
	
	

	private String name;
	private String shortName;
	
	public static ArrayList<Location> availableLocations= new ArrayList<Location>();
	
	static
	{
		availableLocations.add(new Location("Chennai","CHN"));
		availableLocations.add(new Location("Banglore","BANG"));
		availableLocations.add(new Location("Mumbai","MUM"));
	}
	
	
	public Location(String name, String shortName) {
		this.name=name;
		this.shortName=shortName;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public String getShortName(){
		return this.shortName;
	}
}
