/*
��׼����
ѧ���ࣺ��Ա������name age
		���췽�����޲� ��������
		��Ա������getXxx()/setXxx()/show()
*/

class Student{
	private String name;
	private int age;
	public Student(){}

	public Student(String name,int age){
		//System.out.println("���Ǵ�������͵Ĺ��췽��");
		this.age = age;
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void show(){
		System.out.println(name+"---"+age);
	}
}

//������
class StudentTest{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setName("������");
		s1.setAge(22);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		
		Student s2 = new Student("������",22);
		s2.show();
	}
}




