package cn.itcast_02;

/*
 * public String toString():���ظö�����ַ�����ʾ
 * Integer���µ�һ����̬������
 * 		public static String toHexString(int i):��һ������ת��Ϊ16����
 * �����Ϣ��û������ģ�Ҫ��д�÷���
 * 		�Ѹ�������г�Ա����ֵ���ؼ���
 * 		�Զ�����toString()����
 * 		ֱ�����һ����������ƣ���ʵ���ǵ��øö����toString()����
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("------------");
		System.out.println(s.toString());// cn.itcast_02.Student@7852e922

		// toString()������ֵ�ȼ���
		// getClass().getName() + '@' + Integer.toHexString(hashCode())

		System.out.println(s.getClass().getName() + "@" + Integer.toHexString(s.hashCode()));
		// cn.itcast_02.Student@7852e922
		
		//ֱ�������������
		System.out.println(s);//Student [name=null, age=0]
	}
}
