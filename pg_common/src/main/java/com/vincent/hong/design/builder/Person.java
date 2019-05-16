package com.vincent.hong.design.builder;
/**
 * 构建器模式    
 * 使用情景: 在类可能存在多参数情况下,可能利用不同的参数去构建对象时, 建议一开始就设计为构建器模式.
 * 它与传统的重叠构造器模式相比Builder模式的代码更易于阅读和编写.更加安全。
 * @author Administrator
 *
 */
public class Person {
	
	private final String name;
	
	private final int age;
	
	private final char grenade;
	
	private final int weigth;
	
	private final String habit;
	
	private final String hobby;
	
	
	public static class BuilderPerson{
		
		private String name;
		
		private int age;
		
		private char grenade;
		
		private int weigth;
		
		private String habit;
		
		private String hobby;
		
		public BuilderPerson() {}
		
		public BuilderPerson name(String val) {name=val  ; return this;}
		
		public BuilderPerson age(int val) {age=val; return this;}
		
		public BuilderPerson grenade(char val) {grenade=val  ; return this;}
		
		public BuilderPerson weigth(int val) {weigth=val  ; return this;}
		
		public BuilderPerson habit(String val) {habit=val  ; return this;}

		public BuilderPerson hobby(String val) {hobby=val  ; return this;}
 
		
		public Person builder() {
			//这里面可以加上对参数的校验
			return new  Person(this);
		}
	}
	private Person(BuilderPerson person) {
		name=person.name;
		age=person.age;
		grenade=person.grenade;
		weigth=person.weigth;
		habit=person.habit;
		hobby=person.hobby;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", grenade=" + grenade + ", weigth=" + weigth + ", habit="
				+ habit + ", hobby=" + hobby + "]";
	}
}
