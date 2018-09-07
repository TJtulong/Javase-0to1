package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ѧ������ѧ�����֣�ͨ��ѧ�Ż�ȡѧ������
 * Map���ϵ��ص㣺���Դ洢��ֵ�Ե�Ԫ��
 * 		ѧ��1---->����1
 * ����Ψһ�ģ������������Ϊͬһ��ֵ
 * 		����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ���������ӳ�䵽һ��ֵ
 * 
 * Map��Collection������
 * 			Map���ϴ洢Ԫ���ǳɶԳ��ֵģ�
 * 			Collection���ϴ洢Ԫ�ص�������
 * 
 * ע�⣺Map���ϵ����ݽṹֻ��Լ���Ч����ֵ�޹�
 * HashMap��TreeMap
 * 
 * Map���ϵĹ��ܣ�
 * 		1.��ӹ���
 * 				V put(K key, V value):���Ԫ��
 * 				������ǵ�һ�δ洢���ͷ���null
 * 				��������ǵ�һ�δ��ڣ��Ͱ�ֵ����ֵ���ǣ�������ǰ��ֵ
 * 		2.ɾ������
 * 				void clear():�Ƴ����еļ�ֵ��Ԫ��
 * 				V remove(Object key):���ݼ�ɾ����ֵ��Ԫ�أ�������ֵ
 * 		3.�жϹ���
 * 				boolean containsKey(Object key)���жϼ����Ƿ����ָ����
 * 				boolean containsValue(Object value)���жϼ����Ƿ����ָ��ֵ
 * 				boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * 		4.��ȡ����
 * 				Set<Map.Entry<K,V>> entrySet()
 * 				V get(Object key):���ݼ���ȡֵ
 * 				Set<K> KeySet():��ȡ���������м��ļ���
 * 				Collection<V> values(): ��ȡ����������ֵ�ļ���
 * 		5.���ȹ���
 * 				int size():���ؼ����еļ�ֵ����
 * 			
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// V put(K key, V value):���Ԫ��
		// System.out.println("put="+map.put("����","�����P"));//put=null
		// System.out.println("put="+map.put("����","Ҧ��"));//put=�����P

		map.put("�˳�", "��ٳ");
		map.put("������", "Angelababy");
		map.put("�ܽ���", "����");
		map.put("������", "����");

		// void clear()
		// map.clear();

		// V remove(Object key)
		System.out.println("remove=" + map.remove("������"));// remove=Angelababy
		System.out.println("remove=" + map.remove("����"));// remove=null

		// boolean containsKey(Object key)
		System.out.println("contains=" + map.containsKey("������"));
		System.out.println("contains=" + map.containsKey("�ܽ���"));

		// boolean isEmpty()
		System.out.println("isempty=" + map.isEmpty());// isempty=false

		// int size()
		System.out.println("size=" + map.size());// size=3

		// V get(Object key)
		System.out.println("get=" + map.get("�ܽ���"));// get=����

		// Set<K> KeySet()
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key);
		}

		// Collection<V> values()
		Collection<String> col = map.values();
		for (String value : col) {
			System.out.println(value);
		}

		System.out.println("Map:" + map);// ����
	}
}
