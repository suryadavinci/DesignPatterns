package com.railwaybooking.model;



public class Trains {

	Class sleeper;
	Class ac;
	Class general;

	String name;
	
	Routes[] operatingRoutes;
	
	public Class getSleeper(){
		return sleeper;
	}
	
	public Class getAC(){
		return ac;
	}
	
	public Class getGeneral(){
		return general;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	
}


