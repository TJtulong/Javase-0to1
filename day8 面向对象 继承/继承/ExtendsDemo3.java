/*
�̳е�ע������
1.����ֻ�ܼ̳и������еķ�˽�г�Ա
2.���಻�ܼ̳и���Ĺ��췽��
3.��ҪΪ�˲��ֹ��ܶ�ʹ�ü̳�
ʲôʱ���Ǽ̳У�
�̳���ʵʵ�ֵ���һ�ֹ�ϵ��"is a"
���ü��跨
*/
class Father{
	private int num = 10;
	public int num2 = 20;
	private void method(){
		System.out.println(num);
		System.out.println(num2);
	}
	public void show(){
		System.out.println(num);
		System.out.println(num2);
	}
}
class Son extends Father{
	public void function(){
		//System.out.println(num); ���಻�ܼ̳и����˽�г�Ա
		System.out.println(num2);
	}
}
class ExtendsDemo3{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		//s.method() ���಻�ܼ̳и����˽�з���
		s.function();
	}
}