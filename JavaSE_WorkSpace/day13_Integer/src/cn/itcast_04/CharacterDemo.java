package cn.itcast_04;

import java.net.StandardSocketOptions;

/*
 * Character
 * 	构造方法：
 * 		Character(char value)
 */
public class CharacterDemo {
	public static void main(String[] args) {
		Character ch =new Character('a');
		System.out.println("ch="+ch);
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('0'));
		System.out.println(Character.isLowerCase('b'));
		System.out.println(Character.isDigit('0'));
		System.out.println(Character.toLowerCase('C'));
		System.out.println(Character.toUpperCase('t'));
	}
}
