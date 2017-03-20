package com.surya.patterns.decorator;

public class Coffee extends Beverage {

	public Coffee() {
		this.description="Coffee";
	}

	@Override
	public double cost() {
		return 15.20;
	}

}


class Espresso extends Beverage{

	public Espresso(){
		this.description="Espresso";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 55.13;
	}
	
}