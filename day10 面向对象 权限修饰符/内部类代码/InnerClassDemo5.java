/*
�����ڲ��ࣺ�ڲ���ļ�д��
ǰ�᣺����һ�����ӿ�
��ʽ��new ������ӿ���(){
	������д��
}
�����Ǽ̳��˸����ʵ���˸ýӿڵ�������������
*/
interface Inter{
	public abstract void show();
	public abstract void show2();
}

class Outer{
	public void method(){
		/*
		һ��������ʱ��
		new Inter(){
			public void show(){
				System.out.println("show");
			}
		}.show();
		*/
		
		//����������ʱ��
		Inter i = new Inter(){ //��̬
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		};
		i.show();
		i.show2();
	}
}

class InnerClassDemo5{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}