package cn.itcast_04;

/*
 * protected void finalize()
 * 		������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷���
 * protected Object clone()
 * 		���������ش˶����һ������
 * 		��д�÷���
 * 
 * Cloneable:����ʵ����Cloneable�ӿڣ���ָʽObject.clone()���ԺϷ��ĶԸ���ʵ�������ֶθ���
 * 		����ӿ��Ǳ�ǽӿ�
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		// ����ѧ������
		Student s = new Student();
		s.setName("xiao");
		s.setAge(22);
		// ��¡ѧ������
		Object obj = s.clone();
		Student s2 = (Student) obj;

		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());

		Student s3 = s;
		s3.setName("feng");
		s3.setAge(30);
		System.out.println(s.getName() + "---" + s.getAge());// feng---30
		System.out.println(s2.getName() + "---" + s2.getAge());// xiao---22����
		System.out.println(s3.getName() + "---" + s3.getAge());// feng---30
	}
}
