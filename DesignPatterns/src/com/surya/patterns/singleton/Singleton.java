package com.surya.patterns.singleton;

public class Singleton {
	private static Singleton uniqueInstance;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return uniqueInstance= (uniqueInstance == null) ? new Singleton() : uniqueInstance;
	}
}