/*
��һ��java�ļ���д�����ࣺһ���������࣬һ��������
ע�⣺�ļ����ƺͲ���������һ��
*/
class Student{ //������
	//�������
	String name; //null
	int age; //0
	String address; //null
	//���巽��
	public void study(){
		System.out.println("ѧ����ѧϰ");
	}
	
	public void eat(){
		System.out.println("ѧ��Ҫ�Է�");
	}
	
	public void sleep(){
		System.out.println("ѧ��Ҫ˯��");
	}
}

class StudentDemo{
	public static void main(String[] args){
		//���������ʽ������ ������ = new ����()��
		Student s = new Student();
		//ʹ�ñ�����������.������ ������.������
		System.out.println(s.name);
		System.out.println(s.age);
		//����Ա������ֵ
		s.name="����ϼ";
		s.age=27;
		s.address="����";
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		//���÷���
		s.study();
		s.eat();
		s.sleep();
	}
}

