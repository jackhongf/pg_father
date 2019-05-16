package com.vincent.hong.design.observer;

public interface Subject {

	/**
	 * 注册
	 * @param observer
	 */
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
}
