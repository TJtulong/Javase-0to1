package cn.itcast_02;

import java.util.Random;

/*
 * Random:�������������
 * ���췽����
 * 		public Random():û�и����ӣ���Ĭ�ϵ����ӣ��ǵ�ǰʱ��ĺ���ֵ
 * 		public Random(long seed):����ָ��������
 * 		�������Ӻ�ÿ�εõ������������ͬ��
 * ��Ա������
 * 		public int nextInt():���ص���int��Χ�ڵ������
 * 		public int nextInt(int n):���ص���[0,n]��Χ�ڵ������
 * 		
 */
public class RandomDemo {
	public static void main(String[] args) {
		// Random r = new Random();
		Random r = new Random(111);
		for (int x = 0; x < 10; x++) {
			int num = r.nextInt(100) + 1;
			System.out.println(num);
		}
	}
}
