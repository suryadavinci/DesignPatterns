package com.surya.patterns.observer;

public class MobileDevice implements Observer,DisplayElement{

	private Subject weatherData;
	private float temperature;
	
	public MobileDevice(Subject weatherData){
		this.weatherData=weatherData;
		this.weatherData.registerObserver(this);
	}
	public void update(float temperature) {
		this.temperature=temperature;
		display();
	}

	public void display() {
		System.out.println("Mobile Device : the temp is : "+this.temperature);
	}

	
}

class ThirdPartyDevice implements Observer, DisplayElement{

	private float temperature;
	private Subject weatherData; 
	public ThirdPartyDevice(WeatherData weatherData) {
		this.weatherData=weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Third Party : the temp is : "+this.temperature);
	}

	@Override
	public void update(float temperature) {
		this.temperature= temperature;
		display();
		
	}
	
}
