package cn.itcast_06;

import java.util.HashSet;
import java.util.Random;

/*
 * ��ȡ10��1-10���������Ҫ������������ظ�
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Random r= new Random();
		HashSet<Integer> ts = new HashSet<Integer>();
		while(ts.size()<10) {
			int num = r.nextInt(20)+1;
			ts.add(num);
		}
		
		for(Integer i:ts) {
			System.out.println(i);
		}
	}
}
