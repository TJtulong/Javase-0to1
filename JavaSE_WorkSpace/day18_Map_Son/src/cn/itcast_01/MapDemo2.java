package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı���
 * 		1.��ȡ���еļ�
 * 		2.�������ļ��ϣ���ȡÿһ����
 * 		3.���ݼ�ȥ��ֵ
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("�˳�", "��ٳ");
		map.put("������", "Angelababy");
		map.put("�ܽ���", "����");
		map.put("������", "����");

		// ����
		Set<String> set = map.keySet();
		for (String key : set) {
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
