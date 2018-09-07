package cn.itcast_08;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主的洗牌和发牌
 */
public class PokerDemo {
	public static void main(String[] args) {
		// 装牌
		ArrayList<String> array = new ArrayList<String>();
		// 定义一个花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 定义一个点数数组
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (String color : colors) {
			for (String number : numbers) {
				array.add(color.concat(number));
			}
		}
		array.add("大王");
		array.add("小王");

		// 洗牌
		Collections.shuffle(array);

		// 发牌
		ArrayList<String> wang = new ArrayList<>();
		ArrayList<String> ruo = new ArrayList<>();
		ArrayList<String> xiao = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();

		for (int x = 0; x < array.size(); x++) {
			if (x >= array.size() - 3) {
				dipai.add(array.get(x));
			} else if (x % 3 == 0) {
				wang.add(array.get(x));
			} else if (x % 3 == 1) {
				ruo.add(array.get(x));
			} else {
				xiao.add(array.get(x));
			}
		}
		
		//看牌
		lookPoker("王",wang);
		lookPoker("若",ruo);
		lookPoker("潇",xiao);
		lookPoker("底牌",dipai);
	}
	
	public static void lookPoker(String name,ArrayList<String> array) {
		System.out.println(name+"的牌是：");
		for(String s:array) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
}
