package com.surya.patterns.observer;

public interface Subject {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
