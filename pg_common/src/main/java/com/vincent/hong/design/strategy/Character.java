package com.vincent.hong.design.strategy;

/**
 * 策略模式
 * 描述:定义了算法族,分别封装起来,让它们之间可以像话替换,此模式让算法的变化独立于使用算法的客户.
 * @author Administrator
 *
 */
public abstract class Character {
	
	protected  WeaponBehavior weapon;
	
	protected abstract void fight();

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
