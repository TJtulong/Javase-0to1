/*
java�м̳е��ص㣺
1.Java��ֻ֧�ֵ��̳У���֧�ֶ�̳�(��Щ������֧�ֶ�̳е�)
2.java֧�ֶ��̳У��̳���ϵ��
*/

/*
class Father{}
class Mother{}
class Son extends Father,Mother{}//����
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
