class Student{
	public void show(){
		System.out.println("study");
	}
}

class StudentDemo{
	public void method(Student s){
		s.show();
	}
}

class NoNameDemo{
	public static void main(String[] args){
		//�����ֶ���
		Student s = new Student();
		s.show();
		//��������
		new Student().show();
		new Student().show();//���µ���һ���µĶ���
		
		//����������Ϊʵ�ʲ���
		StudentDemo sd = new StudentDemo();
		sd.method(new Student());
		//�Ľ�
		new StudentDemo().method(new Student());
	}
}