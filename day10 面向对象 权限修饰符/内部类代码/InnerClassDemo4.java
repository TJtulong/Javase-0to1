/*
局部内部类
	1.可以直接访问外部类的成员
	2.在局部位置可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能
面试题：
	1.局部内部类访问局部变量必须用final修饰
	2.原因：局部变量随着方法的调用完毕而消失，而堆内存不会消失，用final修饰
	加入final后，变量变为常量，内存中储存的数据为20
*/
class Outer{
	private int num = 10;
	public void method(){
		final int num2 = 10
		class Inner{
			final void show(){
				System.out.println(num2);
			}
		}
		Inner i = new Inner();
		i.show();
	}
}

class InnerClassDemo4{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}