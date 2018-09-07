class Student{
	String name;
	private int age;
	//写一个方法对数据进行校验
	public void setAge(int a){
		if(a<0||a>120){
			System.out.println("年龄有问题");
		}else{
			age = a;
		}
	}
	public void show(){
		System.out.println("姓名："+name);
		System.out.println("性别："+age);
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