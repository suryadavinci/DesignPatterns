package com.surya.patterns.strategy;

public interface QuackBehaviour {
	public void quack();
}


class Quack implements QuackBehaviour{
	public void quack(){
		System.out.println("Quack!!! Quack!!!");
	}
}

class Sqeak implements QuackBehaviour{
	public void quack(){
		System.out.println("Squeak!!! Squeak!!!");
	}
}

class CantQuack implements QuackBehaviour{
	public void quack(){
		System.out.println("I'm a silent duck");
	}
	
}