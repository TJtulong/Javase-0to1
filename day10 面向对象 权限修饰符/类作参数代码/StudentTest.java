/*
��ʽ������
	��������
	��������
		�ࣨ����������Ҫ���Ǹ���Ķ���
		������
		�ӿ�
*/

class Student{
	public void study(){
		System.out.println("�ú�ѧϰ");
	}
}

class StudentDemo{
	public void method(Student s){
		s.study();
	}
}

class StudentTest{
	public static void main(String[] args){
		Student s = new Student();
		s.study();
		System.out.println("--------");
		StudentDemo sd = new StudentDemo();
		s = new Student();
		sd.method(s);
		//���������÷�
		new StudentDemo().method(new Student());
	}
}