//��Ա�ڲ�������η�

class Body{
	private class Heart{
		public void operateor(){
			System.out.println("�������");
		}
	}
	
	public void method(){
		Heart h = new Heart();
		h.operateor();
	}
}

class Outer{
	private int num =10;
	private static int num2 =10;
	//ע�⣺��̬�ڲ�����ʵ��ⲿ�����ݱ����þ�̬����
	public static class Inner{
		public void show(){
			//System.out.println(num);
			System.out.println(num2);
		}
		public static void show2(){
			//System.out.println(num);
			System.out.println(num2);
		}
	}
}

class InnerClassDemo3{
	public static void main(String[] args){
		Body b = new Body();
		b.method();
		
		//��Ա�ڲ��౻��̬���κ�ķ��ʷ�ʽ
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();
		
		//show2����һ�ֵ��÷�ʽ
		Outer.Inner.show2();
	}
}