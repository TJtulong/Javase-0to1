package cn.itcast_01;

/*
 * Object:�� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ����
 * ÿ���඼ֱ�ӻ��ӵļ̳���Object��
 * Objectֻ���޲ι��췽��
 * 
 * Object��ķ���:
 * 		public int hashCode():���ظö���Ĺ�ϣ��ֵ
 * 			ע�⣺��ϣֵ�Ǹ��ݹ�ϣ�㷨���������ֵ�����ֵַ�йص����ǵ�ֵַ
 * 
 * 		public final Class getClass():���ش�Object��������
 * 			Class��ķ�����
 * 				public String getName():
 * 				�� String ����ʽ���ش� Class ��������ʾ��ʵ�����ơ�
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());// 2018699554
		Student s2 = new Student();
		System.out.println(s2.hashCode());// 1311053135
		Student s3 = s1;
		System.out.println(s3.hashCode());// 2018699554
		System.out.println("------------------");

		Student s = new Student();
		Class c = s.getClass();
		String str = c.getName();
		System.out.println(str);// cn.itcast_01.Student
		
		//��ʽ���
		String str2 = s.getClass().getName();
		System.out.println(str2);
	}
}
