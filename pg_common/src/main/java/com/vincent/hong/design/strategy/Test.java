package com.vincent.hong.design.strategy;

public class Test {

	public static void main(String[] args) {
		//国王选择不同种类的刺杀方法
		Character character=  new King();
		character.setWeapon(new SwordBehavior());
		character.fight();
		character.setWeapon(new AxeBehavior());
		character.fight();
		character.setWeapon(new KnifeBehavior());
		character.fight();
		
		//但最终国王推荐骑士还是使用刀子比较好
		Character knight=  new Knight();
		knight.setWeapon(new KnifeBehavior());
		knight.fight();
	}

}
