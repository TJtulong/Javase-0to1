package cn.itcast_02;

import java.util.LinkedHashSet;

/*
 * LinkedHashList:�ײ����ݽṹ�ɹ�ϣ����������
 * ��ϣ��֤Ԫ�ص�һ����
 * ����֤Ԫ�����򣨴����ȡ��һ�£�
 */
public class LinkedHashListDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		hs.add("hello");
		hs.add("world");
		hs.add("java");

		for (String s : hs) {
			System.out.println(s);// ����������
		}
	}
}
