package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����
 * 		Patter��Matcher���ʹ��
 */
public class RegexDemo {
	public static void main(String[] args) {
		//ģʽ��ƥ�����ĵ��͵���˳��
		//��������ʽ�����ģʽ����
		Pattern p=Pattern.compile("a*b");
		//ͨ��ģʽ����õ�ƥ�����������ʱ����Ҫ��ƥ����ַ���
		Matcher m =p.matcher("aaaaab");
		//����ƥ����������
		boolean b=m.matches();
		System.out.println(b);
	}
}
