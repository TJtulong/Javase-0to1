//形式参数是基本类型
class Demo{
	public int sum(int a, int b){
		return a+b;
	}
}
//形参是基本类型
class Student{
	public void show(){
		System.out.println("我爱学习");
	}
}

class StudentDemo{
	//如果一个方法的形式参数是一个类类型（引用类型），这里其实需要的是该类的对象
	public void method(Student s){
		s.show();
	}
}

class ArgsDemo{
	public static void main(String[] args){
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println("result="+result);
		//需求：调用StudentDemo中的method()方法
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);
	}
}