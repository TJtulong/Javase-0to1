class Student{
	String name;
	private int age;
	//дһ�����������ݽ���У��
	public void setAge(int a){
		if(a<0||a>120){
			System.out.println("����������");
		}else{
			age = a;
		}
	}
	public void show(){
		System.out.println("������"+name);
		System.out.println("�Ա�"+age);
	}
}

class StudentDemo{
	public static void main(String[] args){
		Student s = new Student();
		//s.age=27;
		s.setAge(-27);
		s.show();
	}
}