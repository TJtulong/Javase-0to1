package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * System.in ��׼���������Ӽ��̻�ȡ����
 * ����¼������
 * 		1.main�����е�args���ղ���
 * 		2.Scanner()  JDK1.5�Ժ�
 * 		3.ͨ���ַ���������װ��׼������
 * 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemInDemo {
	public static void main(String[] args) throws IOException{
		//��ȡ��׼������
		InputStream is = System.in;
		
		//һ�λ�ȡһ������readline()
		//���ֽ���ת��Ϊ�ַ���
		/*InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������һ���ַ���");
		String line = br.readLine();
		System.out.println(line);
	}
}
