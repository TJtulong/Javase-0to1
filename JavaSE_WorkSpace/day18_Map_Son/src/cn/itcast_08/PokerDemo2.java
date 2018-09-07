package cn.itcast_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * 思路：
 * 		1.创建一个HashMap集合
 * 		2.创建一个ArrayList集合
 * 		3.创建花色数组和点数数组
 * 		4.从0开始往HashMap中储存编号和对应的牌
 * 		5.洗牌（洗编号）
 * 		6.发牌（发编号）
 * 		7.看牌（获取编号，从TreeMap中找对应值）
 */
public class PokerDemo2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		ArrayList<Integer> array = new ArrayList<Integer>();
		// 定义一个花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 定义一个点数数组
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", };

		int index = 0;
		for (String number : numbers) {
			for (String color : colors) {
				String poker = color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王");
		array.add(index);

		// 洗牌
		Collections.shuffle(array);

		// 发牌
		TreeSet<Integer> wang = new TreeSet<>();
		TreeSet<Integer> ruo = new TreeSet<>();
		TreeSet<Integer> xiao = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();

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

		// 看牌
		lookPoker("王", wang, hm);
		lookPoker("若", ruo, hm);
		lookPoker("潇", xiao, hm);
		lookPoker("底牌", dipai, hm);
	}

	public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
		System.out.println(name + "的牌是：");
		for (Integer key : ts) {
			String value = hm.get(key);
			System.out.print(value + "\t");
		}
		System.out.println();
	}
}
