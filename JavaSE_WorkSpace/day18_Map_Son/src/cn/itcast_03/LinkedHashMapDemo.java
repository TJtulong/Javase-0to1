package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LinkedHashMap:��Map�ӿڵĹ�ϣ�������ʵ�֣����п�Ԥ֪�ĵ���˳��
 * �й�ϣ��֤Ωһ�ԣ�������֤����
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();

		hm.put("it003", "����");
		hm.put("it004", "�ǲ�˹");
		hm.put("it005", "�ų���");
		hm.put("it002", "�ò���");
		hm.put("it002", "�ȶ��Ǵ�");

		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);// ����
		}
	}
}
