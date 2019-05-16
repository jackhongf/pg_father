package com.vincent.hong.design.strategy;

public class Knight extends Character {

	@Override
	public void fight() {
		System.out.println("Knight fight:"+weapon.useWeapon());
	}

}
