/*
�ֲ��ڲ���
	1.����ֱ�ӷ����ⲿ��ĳ�Ա
	2.�ھֲ�λ�ÿ��Դ����ڲ������ͨ����������ڲ��෽������ʹ�þֲ��ڲ��๦��
�����⣺
	1.�ֲ��ڲ�����ʾֲ�����������final����
	2.ԭ�򣺾ֲ��������ŷ����ĵ�����϶���ʧ�������ڴ治����ʧ����final����
	����final�󣬱�����Ϊ�������ڴ��д��������Ϊ20
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