package cn.itcast_02;
/*
 * �������������⣬����û�д���jvmĬ�ϴ���
 * �Լ�����
 * 		1.try...catch...finally
 * 		��ʽ��
 * 			try{
 * 				���ܳ��ֵĴ���
 * 			}catch(�쳣������){
 * 				�������Ĵ���
 * 			}finally{
 * 				�ͷ���Դ
 * 			}
 * 		���θ�ʽ
 * 			try{
 * 				���ܳ��ֵĴ���
 * 			}catch(�쳣������){
 * 				�������Ĵ���
 * 			}
 * 		try����Ĵ���Խ��Խ��,catch����������ݣ�������һ���򵥵���ʾ
 * 		2.throws �׳�
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		// int b=2;
		int b = 0;
		
		try {
			System.out.println(a / b);
		}catch(ArithmeticException ae){
			System.out.println("��������Ϊ0");
		}
		System.out.println("over");
	}
}
