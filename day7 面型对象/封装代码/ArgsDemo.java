//��ʽ�����ǻ�������
class Demo{
	public int sum(int a, int b){
		return a+b;
	}
}
//�β��ǻ�������
class Student{
	public void show(){
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentDemo{
	//���һ����������ʽ������һ�������ͣ��������ͣ���������ʵ��Ҫ���Ǹ���Ķ���
	public void method(Student s){
		s.show();
	}
}

class ArgsDemo{
	public static void main(String[] args){
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println("result="+result);
		//���󣺵���StudentDemo�е�method()����
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);
	}
}