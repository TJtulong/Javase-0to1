package cn.itcast_03;

import java.util.TreeSet;

/*
 * TreeSet:能够对元素按照某种规则进行排序
 * 排序有两种方式：
 * 		1.自然排序
 * 		2.比较器排序
 * TreeSet集合的特点：排序和唯一
 * 
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(17);
		ts.add(20);
		ts.add(19);
		
		for(Integer i:ts) {
			System.out.println(i);//由小到大输出（自然排序）
		}
		
	}
}
