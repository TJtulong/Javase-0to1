package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;

/*
 * Set:���򣨴洢˳����ȡ��˳��Ψһ����Ψһ
 * HastSet:������֤set�ĵ���˳���ر���������֤��˳���ò���
 * 			���Լ��Ĵ洢˳��
 */
public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("world");// ��ͬ�Ĳ���ȥ
		set.add("java");// ��ͬ�Ĳ���ȥ

		for (String s : set) {
			System.out.println(s);
		}
	}
}
