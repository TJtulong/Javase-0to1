package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap:�ǻ��ں������Map�ӿ�ʵ��
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("it003", "����");
		tm.put("it004", "�ǲ�˹");
		tm.put("it005", "�ų���");
		tm.put("it002", "�ò���");
		tm.put("it002", "�ȶ��Ǵ�");

		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "----" + value);// ��Ȼ����
		}
	}
}
