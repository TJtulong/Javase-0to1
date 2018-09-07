package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı���
 * ˼·��
 * 		1.��ȡ���м�ֵ�Զ���ļ���
 * 		2.������ֵ�Զ��󼯺ϣ��õ�һ����ֵ�Զ���
 * 		3.���ݼ�ֵ�Զ����ȡ����ֵ
 * 
 * ��ȡ��ֵ�Զ���
 * 		Set<Map.Entry<K,V>> entrySet()
 * 		Map.Entry<K,V>���Ǽ�ֵ�Զ���
 * 		Entry:ʵ��
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("�˳�", "��ٳ");
		map.put("������", "Angelababy");
		map.put("�ܽ���", "����");
		map.put("������", "����");

		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> me : set) {
			// ���ݼ�ֵ��ȡ����ֵ
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "----" + value);
		}
	}
}
