/*
���췽��:����������ݽ��г�ʼ��
��ʽ��A����������������ͬ
      B��û�з���ֵ���ͣ���void��û��
	  C��û�о��巵��ֵ
ϵͳ���Զ��ṩһ���޲η�����
����Լ������˹��췽����ϵͳ�������ṩĬ�ϵĹ��췽��
����Ա������ֵ�����ַ�����setXxx; ���췽��
*/
class Student{
	private String name;
	private int age;
	public Student(){
		System.out.println("�����޲ι��췽��");
	}
	//���췽�������ظ�ʽ
	public Student(String name){
		System.out.println("���Ǵ�string���͵Ĺ��췽��");
		this.name = name;
	}
	public Student(int age){
		System.out.println("���Ǵ�int���͵Ĺ��췽��");
		this.age = age;
	}
	public Student(String name,int age){
		System.out.println("���Ǵ�������͵Ĺ��췽��");
		this.age = age;
		this.name = name;
	}
	public void show(){
		System.out.println(name+"---"+age);
	}
}

class ConstructDemo{
	public static void main(String[] Args){
		Student s1 = new Student();
		System.out.println(s1);//Student@15db9742
		Student s2 = new Student("������");
		s2.show();
		Student s3 = new Student(22);
		s3.show();
		Student s4 = new Student("������",22);
		s4.show();
	}
}