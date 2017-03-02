package com.railwaybooking.model;

public class MumbaiExpress extends Trains {


	public static MumbaiExpress mXB= new MumbaiExpress();

	{
		general = new Class(100);
		sleeper = new Class(80);
		ac= new Class(40);
		this.name="MumbaiExpress";

	}
	
	
	private MumbaiExpress(){
		
	}
}
