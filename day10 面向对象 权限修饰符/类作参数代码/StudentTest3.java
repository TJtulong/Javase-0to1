class Student{
	public void study(){
		System.out.println("好好学习");
	}
}

class StudentDemo{
	public Student getStudent(){
		return new Student();
	}
}

class StudentTest3{
	public static void main(String[] args){
		StudentDemo sd = new StudentDemo();
		sd.getStudent().study();//链式编程
	}
}