package com.vincent.hong.design.strategy;

public class King extends Character {

	@Override
	public void fight() {
		System.out.println("King fight:"+weapon.useWeapon());
	}

}
