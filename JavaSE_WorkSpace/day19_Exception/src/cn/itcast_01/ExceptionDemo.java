package cn.itcast_01;

/*
 * �쳣����������˲����������
 * ������쳣��Throwable
 * 		��������:Error ��������������أ������ڴ������
 * 		���⣺Exception
 * 			����������:����RuntimeException���쳣 ������д���������벻��ͨ��
 * 			����������:RuntimeException ���������벻���Ͻ�����Ҫ��������
 * �������������⣬����û�д���jvmĬ�ϴ���
 * ���쳣�����ơ�ԭ�򼰳��ֵ��������Ϣ����ڿ���̨��ͬʱ���������
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		// int b=2;
		int b = 0;
		System.out.println(a / b);//ArithmeticException--->RuntimeException
		System.out.println("over");
	}
}
