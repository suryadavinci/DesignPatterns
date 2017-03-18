package com.surya.patterns.strategy;

public class Duck {
	QuackBehaviour quack;
	FlyBehaviour fly;
	
	public Duck(){
		
	}
	
	public Duck(FlyBehaviour fly, QuackBehaviour quack){
		this.quack=quack;
		this.fly=fly;
	}
	
	public void swim(){
		System.out.println("I'm Swimming");
	}

	public void performQuack(){
		this.quack.quack();
	}
	
	public void performFly(){
		this.fly.fly();
	}
	
	
	public void setQuack(QuackBehaviour newQuack){
		this.quack=newQuack;
	}
	
	public void setFly(FlyBehaviour newFly){
		this.fly=newFly;
	}
}

class MallardDuck extends Duck{

	public MallardDuck(){
		super(new CanFly(),new Quack());		
	}
	
	
	public MallardDuck(FlyBehaviour fly, QuackBehaviour quack) {
		super(fly, quack);
	}
	
}


class RubberDuck extends Duck{

	public RubberDuck(){
		super(new CantFly(),new Sqeak());		
	}
	
	
}

class WoodenDuck extends Duck{

	public WoodenDuck(){
		super(new CantFly(),new CantQuack());		
	}
	
}