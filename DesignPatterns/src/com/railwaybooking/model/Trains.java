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
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		System.out.println(this.name);
		System.out.println("-------------------------------------------------");
		System.out.println("Class\t\t| TotalSeats\t| AvailableSeats \t|");
		System.out.println("-------------------------------------------------");
		System.out.println("General\t\t| "+this.general.getTotalSeats()+"\t\t| "+(this.general.getTotalSeats()- this.general.getBookedSeats())+"\t\t|");
		System.out.println("Sleeper\t\t| "+this.sleeper.getTotalSeats()+"\t\t| "+(this.sleeper.getTotalSeats()- this.sleeper.getBookedSeats())+"\t\t|");
		System.out.println("AC\t\t| "+this.ac.getTotalSeats()+"\t\t| "+(this.ac.getTotalSeats()- this.ac.getBookedSeats())+"\t\t|");
	}
	
}


