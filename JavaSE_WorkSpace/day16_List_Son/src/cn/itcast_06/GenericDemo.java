package cn.itcast_06;

/*
 * 	Ϊ������������ڴ��������ʱ�����ȷԪ�ص��������ͣ����ּ���Ϊ����
 * 	���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ���������������ʱ���ȥ��ȷ����������
 * 		Ҳ����Ϊ���������ͣ������������һ������
 * 	��ʽ��
 * 		<��������> ֻ������������
 * 	�ô���	1.������ʱ��������ǰ�������ڼ�
 * 			2.������ǿ������ת��
 * 			3.�Ż��˳�����ƣ�����˻�ɫ������
 */
import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<String> array = new ArrayList<String>();

		// ���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		// array.add(10);//JDK5�Ժ��Զ�װ��
		// �ȼ��ڣ�array.add(Integer.valueOf(10))

		// ����
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// String s = (String) it.next();
			String s = it.next();
			System.out.println(s);
		}
	}
}
