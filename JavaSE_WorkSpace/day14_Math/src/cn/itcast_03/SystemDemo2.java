package cn.itcast_03;

/*
 * public static void exit(int status)
 * 		��ֹ��ǰ�������е�java���������������״̬�룬���ݹ�������0��״̬���ʾ�쳣��ֹ
 * public static long currentTimeMillis()
 * 		�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 */
public class SystemDemo2 {
	public static void main(String[] args) {
		System.out.println("hhhhh");
		// System.exit(0);
		System.out.println("bainiangzi");
		// System.out.println(System.currentTimeMillis());
		long start = System.currentTimeMillis();
		//����������������ʱ��
		for (int x = 0; x < 100000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("��ʱ" + (end - start) + "����");
	}
}
