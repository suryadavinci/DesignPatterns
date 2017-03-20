package com.surya.patterns.decorator;

public abstract class Toppings extends Beverage {

		public abstract String getDescription();

}



class Whip extends Toppings{

	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 12.55+beverage.cost();
	}
	
}



class Cream extends Toppings{

	Beverage beverage;
	
	public Cream (Beverage beverage){
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Cream";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 8.55+beverage.cost();
	}
	
}