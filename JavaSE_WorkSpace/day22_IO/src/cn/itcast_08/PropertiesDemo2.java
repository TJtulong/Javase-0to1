package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/*
 * 特殊功能：
 * 		添加元素
 * 		public Object setProperty(String key,String value);
 * 		获取元素
 * 		public String getProperty(String key);
 * 		获取所有的键的集合
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
