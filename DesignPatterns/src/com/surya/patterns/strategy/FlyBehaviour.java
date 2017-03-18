package com.surya.patterns.strategy;

public interface FlyBehaviour {
	public void fly();
}


class CanFly implements FlyBehaviour{
	public void fly(){
		System.out.println("I can fly");
	}
}

class CantFly implements FlyBehaviour{
	public void fly(){
		System.out.println("I cant fly");
	}
}