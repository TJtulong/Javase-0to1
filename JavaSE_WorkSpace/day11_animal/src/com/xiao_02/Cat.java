package com.xiao_02;

/**
 * 这是具体的猫类
 * 
 * @version V1.0
 * @author TJtulong
 *
 */
public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void sleep() {
		System.out.println("猫睡觉");
	}

}
