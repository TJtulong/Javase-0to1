package cn.itcast_04;
/*
 * float��double���ͺ����׶�ʧ����
 * Ϊ����߾��ȣ����㸡������java�ṩ��BigDecimal��
 * BigDecimal:���ɱ�ġ����⾫�ȵ��з���ʮ������
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(0.09 + 0.01);// 0.09999999999999999
		System.out.println(1.0 - 0.32);// 0.6799999999999999
		System.out.println(1.015 * 100);// 101.49999999999999
		System.out.println(1.301 / 100);// 0.013009999999999999

		System.out.println(1 - 0.12);// 0.88
	}
}
