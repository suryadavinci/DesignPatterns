package com.surya.patterns.decorator;

public abstract class Beverage {

	String description="No Description";
	public abstract double cost();
	public String getDescription(){
		return this.description;
	}
}
