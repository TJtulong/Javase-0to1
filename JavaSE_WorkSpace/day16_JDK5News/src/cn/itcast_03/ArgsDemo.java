package cn.itcast_03;

/*
 * 	�ɱ�������������ʱ��֪���ж��ٲ���
 * 	��ʽ��
 * 			���η� ����ֵ���� ������(��������... ������){}
 * 	����ı�����һ������
 * 	�ɱ����һ�������һ��
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result=" + result);

		int c = 30;
		result = sum(a, b, c);
		System.out.println("result=" + result);
	}

	public static int sum(int... a) {
		int s=0;
		for(int x:a) {
			s+=s;
		}
		return s;
	}
}
