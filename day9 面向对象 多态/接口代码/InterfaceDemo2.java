/*
	�ӿڳ�Ա�����ص㣺
	��Ա������ֻ���ǳ����������Ǿ�̬����Ĭ�����η� public static final
	���췽�����ӿ�û�й��췽���������඼�̳���һ����object��
	��Ա������ֻ���ǳ��󷽷���Ĭ��Ϊpublic abstract
	
*/

interface Inter{
	public int num = 10;
	public final int num2 = 20;
	//public Inter(){}
	void show();//Ĭ��Ϊpublic abstract
}

//�ӿ���+Impl���ָ�ʽ�ǽӿڵ�ʵ�����ʽ
class InterImpl extends Object implements Inter{
	public InterImpl(){
		super();
	}
	public void show(){};
}

class InterfaceDemo2{
	public static void main(String[] args){
		Inter i = new InterImpl();
		System.out.println(i.num);//10
		System.out.println(i.num2);//20
		//i.num = 100;
		//i.num2 = 200;�����޸ģ�final��
		//System.out.println(i.num);
		//System.out.println(i.num2;
		System.out.println(Inter.num);
		System.out.println(InterImpl.num2);//10 Ĭ���Ǿ�̬
		System.out.println("----------");//20
	}
}