/*
�����⣺fianl���ξֲ�����������
*/

class Student{
	int age = 10;
}

class FinalTest{
	public static void main(String[] args){
		//�ֲ������ǻ�����������
		int x = 10;
		x = 100;
		System.out.println(x);
		final int y = 10;
		//y = 100;  �޷�Ϊ���ձ���y����ֵ
		System.out.println(y);
		
		//�ֲ�������������������
		Student s = new Student();
		System.out.println(s.age);
		s.age = 100;
		System.out.println(s.age);
		
		final Student ss = new Student();
		System.out.println(ss.age);
		ss.age = 100;
		System.out.println(ss.age);//������������һ��
		
		//���·����ڴ�ռ�,������
		ss = new Student();
	}
}