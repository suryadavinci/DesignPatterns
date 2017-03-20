package com.surya.patterns.decorator;

public class SunBucksCoffee {

	public static void main(String[] args) {

		Beverage b= new Espresso();
		b= new Cream(b);
		b= new Whip(b);
		
		System.out.println(b.getDescription());
		System.out.println(b.cost());
			
		
	}

}
