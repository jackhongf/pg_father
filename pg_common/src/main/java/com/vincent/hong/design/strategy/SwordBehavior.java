package com.vincent.hong.design.strategy;

/**
 * 定义宝剑刺杀算法
 * @author Administrator
 *
 */
public class SwordBehavior implements WeaponBehavior {

	@Override
	public String useWeapon() {
		return "SwordBehavior do !!!";
	}

}
