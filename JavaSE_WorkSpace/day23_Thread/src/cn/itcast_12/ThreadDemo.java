package cn.itcast_12;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

public class ThreadDemo {
	public static void main(String[] args) {
		// �̰߳�ȫ���ࣨ�������ˣ�
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<>();
		Hashtable<String, String> h = new Hashtable<>();

		// Vector���̰߳�ȫʱ�ſ���ʹ�õģ���Ҳ��ʹ��

		// �����̰߳�ȫ��List
		List<String> list = Collections.synchronizedList(new ArrayList<String>());

	}
}
