package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/*
 * Properties:���Լ����࣬��һ�����Ժ�IO������ʹ�õļ�����
 * Properties���Ա��������л�����м��ؼ���ֵ��Ϊ�ַ���
 * 
 * ��Hashtable�����࣬��Map����
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties prop = new Properties();
		System.out.println("prop="+prop);
		
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");
		
		System.out.println("prop="+prop);
		
		//��������
		Set<Object> set = prop.keySet();
		for(Object key:set) {
			Object value = prop.get(key);
			System.out.println(key+"----"+value);
		}
	}
}
