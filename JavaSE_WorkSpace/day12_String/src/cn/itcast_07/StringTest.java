package cn.itcast_07;

//���󣺰������е����ݰ���ָ����ʽƴ�ӳ��ַ���
public class StringTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		String s = "";
		s += "[";
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				s += arr[x] + "]";
			} else {
				s += arr[x] + ", ";
			}
		}
		System.out.println(s);
	}
}
