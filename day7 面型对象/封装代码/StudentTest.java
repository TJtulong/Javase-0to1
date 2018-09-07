class Student{
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		//name = name; //错误：就近原则
		this.name = name;
	}
	public void setAge(int age){
		this.age = a;
	}
}

class StudentTest{
	public static void main(String[] args){
		Student s = new Student();
		s.setName("王若潇");
		s.setAge(22);
		System.out.println("name="+s.getName()+"age="+s.getAge());
	}
}