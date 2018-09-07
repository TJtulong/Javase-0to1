package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/*
 * ���⹦�ܣ�
 * 		���Ԫ��
 * 		public Object setProperty(String key,String value);
 * 		��ȡԪ��
 * 		public String getProperty(String key);
 * 		��ȡ���еļ��ļ���
 * 		public Set<String> stringPropertyNames();
 */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("it002", "hello");
		prop.setProperty("it001", "world");
		prop.setProperty("it003", "java");

		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			Object value = prop.get(key);
			System.out.println(key + "----" + value);
		}
	}
}
