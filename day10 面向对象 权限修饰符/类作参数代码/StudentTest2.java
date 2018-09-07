class Student{
	public void study(){
		System.out.println("ºÃºÃÑ§Ï°");
	}
}

class StudentDemo{
	public Student getStudent(){
		return new Student();
	}
}

class StudentTest2{
	public static void main(String[] args){
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent();
		s.study();
	}
}