class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
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
}

class Student extends Person{
	public Student(){}
	public Student(String name,int age){
		super(name,age);
	}
}

class ExtendsTest4{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setName("ÍõÈôäì");
		s1.setAge(22);
		System.out.println(s1.getName()+"---"+s1.getAge());
		Student s2 = new Student("ÍõÈôäì",22);
		System.out.println(s2.getName()+"---"+s2.getAge());
	}
}