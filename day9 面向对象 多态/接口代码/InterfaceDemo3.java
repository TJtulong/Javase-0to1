/*
	�����ࣺ�̳й�ϵ��ֻ�ܵ��̳У����Զ��̳�
	����ӿڣ�ʵ�ֹ�ϵ,���Ե�ʵ�֣�Ҳ���Զ�ʵ�֣����ҿ��Լ̳�һ�����ͬʱʵ�ֶ���ӿ�
	�ӿ���ӿڣ��̳й�ϵ�����Ե��̳У�Ҳ���Զ�̳�
*/

interface Father{
	public abstract void show();
}

interface Mother{
	public abstract void show2();
}

interface Sister extends Father,Mother{}

class Son implements Father,Mother{
	public void show(){
		System.out.println("show son");
	}
	public void show2(){
		System.out.println("show2 son");
	}
}

class InterfaceDemo3{
	public static void main(String[] args){
		Father f = new Son();
		f.show();
		Mother m = new Son();
		m.show2();
	}
}