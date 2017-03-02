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
	
	public void printDetails(){
		System.out.println(this.name);
		System.out.println("Class\t\tTotalSeats\tBookedSeats");
		System.out.println("General\t\t"+this.general.getTotalSeats()+"\t"+this.general.getBookedSeats());
		System.out.println("Sleeper\t\t"+this.sleeper.getTotalSeats()+"\t"+this.sleeper.getBookedSeats());
		System.out.println("AC\t\t\t"+this.ac.getTotalSeats()+"\t"+this.ac.getBookedSeats());
	}
	
}


