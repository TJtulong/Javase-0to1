/*
java中继承的特点：
1.Java中只支持单继承，不支持多继承(有些语言是支持多继承的)
2.java支持多层继承（继承体系）
*/

/*
class Father{}
class Mother{}
class Son extends Father,Mother{}//错误
*/

class GrandFather{
	public void show(){
		System.out.println("grandfather");
	}
}
class Father extends GrandFather{
	public void method(){
		System.out.println("father");
	}
}
class Son extends Father{}
class ExtendsDemo2{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		s.method();
	}
}
