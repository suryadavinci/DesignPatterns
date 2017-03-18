package com.surya.patterns.strategy;

import java.util.Scanner;

public class DuckSimulaterClient {

	public static void main(String[] args) {

		System.out.println("Create a new Duck :  m/r/w ");
		Scanner s=new Scanner(System.in);
		
		String duck=s.next();
		Duck newDuck = null;
		
		switch (duck){
		case "m":
			newDuck= new MallardDuck();
			break;
		case "r":
			newDuck= new RubberDuck();
			break;
		case "w":
			newDuck= new WoodenDuck();
			break;
		}
		
		newDuck.performFly();
		newDuck.performQuack();
		newDuck.swim();
		s.close();
		
	}

}
