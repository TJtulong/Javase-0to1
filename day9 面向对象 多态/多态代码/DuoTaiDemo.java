/*
��̬�еĳ�Ա�����ص㣺
1.��Ա���������뿴��ߣ����п����
2.���췽���������������ʱ�����ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ��
3.��Ա���������뿴��ߣ����п��ұ�
4.��̬����;���뿴��ߣ����п����(��̬������أ��㲻����д)
���ڳ�Ա����������д��������п��ұ�
*/
class Fu{
	public int num =100;
	public void show(){
		System.out.println("show Fu");
	}
	public static void function(){
		System.out.println("function Fu");
	}
}

class Zi extends Fu{
	public int num = 1000;
	public int num2 = 200;
	//������д
	public void show(){
		System.out.println("show Zi");
	}
	public void method(){
		System.out.println("method Zi");
	}
	public static void function(){
		System.out.println("function Zi");
	}
}

class DuoTaiDemo{
	public static void main(String[] args){
		Fu f =new Zi();
		System.out.println(f.num);
		//System.out.println(f.num2);�Ҳ�������
		f.show();
		//f.method();�Ҳ�������
		f.function();
	}
}