package cn.itcast_03;

import java.util.TreeSet;

/*
 * TreeSet:�ܹ���Ԫ�ذ���ĳ�ֹ����������
 * ���������ַ�ʽ��
 * 		1.��Ȼ����
 * 		2.�Ƚ�������
 * TreeSet���ϵ��ص㣺�����Ψһ
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
			System.out.println(i);//��С�����������Ȼ����
		}
		
	}
}
