package com.surya.patterns.observer;

public class WeatherStation{

	public static void main(String[] args) {
		WeatherData weatherData= new WeatherData();
		
		MobileDevice mDevice= new MobileDevice(weatherData);
		ThirdPartyDevice tDevice= new ThirdPartyDevice(weatherData);

		
		weatherData.setTemperature(10.3f);
		weatherData.setTemperature(12.3f);
		weatherData.setTemperature(36.7f);
	}

}
