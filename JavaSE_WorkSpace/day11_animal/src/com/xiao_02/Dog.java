package com.xiao_02;

import com.xiao_01.Jump;

/**
 * ���Ǿ���Ĺ���
 * 
 * @version V1.0
 * @author TJtulong
 *
 */
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		System.out.println("�����ߵĹ�");
	}

	@Override
	public void eat() {
		System.out.println("������");
	}

	@Override
	public void sleep() {
		System.out.println("��˯��");
	}

}
