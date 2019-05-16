package com.vincent.hong.design.strategy;
/**
 * 定义刀子刺杀算法
 * @author Administrator
 *
 */
public class KnifeBehavior implements WeaponBehavior {

	@Override
	public String useWeapon() {
		 return "KnifeBehavior do!!!";
	}

}
