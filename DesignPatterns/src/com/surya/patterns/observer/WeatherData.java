package com.surya.patterns.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temperature;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	public void notifyObservers() {
		for(Observer current:this.observers){
			current.update(this.temperature);
		}
	}
	
	public void setTemperature(float temperature){
		this.temperature=temperature;
		measurementsChanged();
	}

	private void measurementsChanged(){
		notifyObservers();
	}
}
