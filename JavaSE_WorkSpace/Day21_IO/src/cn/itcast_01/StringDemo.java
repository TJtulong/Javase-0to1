package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * ͨ��ָ���ַ��������ֽ�����
 * String(byte[] bytes,String charsetName)������--->�ѿ������ı�ɿ��ö���
 * byte[] getBytes(String charsetName):����--->�ѿ��ö��ı�ɿ�������
 * 
 * �������⣺ֻҪ�������ĸ�ʽһ�£��Ͳ��������
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "���";

		// Ĭ��ΪGBK
		byte[] bys = s.getBytes();
		//byte[] bys = s.getBytes("UTF-8");// [-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));// [-60, -29, -70, -61]
		
		String ss = new String(bys);
		//String ss = new String(bys,"UTF-8");//???
		System.out.println(ss);
	}
}
