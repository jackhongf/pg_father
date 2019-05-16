package com.vincent.hong.design.strategy;

public class Queen extends Character {

	@Override
	public void fight() {
		System.out.println("Queen fight :"+weapon.useWeapon());
	}
}
