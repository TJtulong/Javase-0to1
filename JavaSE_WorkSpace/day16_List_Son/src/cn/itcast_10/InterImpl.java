package cn.itcast_10;
/*
 * 	ʵ������ʵ�ֽӿڵ�ʱ��
 * 		1.��֪����
 * 		2.δ֪����
 */
/*public class InterImpl implements Inter<String>{

	@Override
	public void show(String t) {
		System.out.println(t);
	}	
}*/

//�ڶ������
public class InterImpl<T> implements Inter<T>{

	@Override
	public void show(T t) {
		System.out.println(t);
	}
	
}
