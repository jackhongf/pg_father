package com.vincent.hong.design.strategy;

/**
 * 定义斧头刺杀算法
 * @author Administrator
 *
 */
public class AxeBehavior implements WeaponBehavior {

	@Override
	public String useWeapon() {
		return "AxeBehavior do !!!";
	}

}
