/*
1.��������й��췽������Ĭ�Ϸ��ʸ�����޲ι��췽��
�����ʼ��֮ǰ��һ��Ҫ��ɸ���ĳ�ʼ��
ע�⣺����ÿһ�����췽���ĵ�һ��Ĭ����䶼��super()
*/
class Father{
	public Father(){
		
		System.out.println("father���޲ι��췽��");
	}
	public Father(String name){
		System.out.println("father�Ĵ��ι��췽��");
	}
}
class Son extends Father{
	public Son(){
		super();//Ĭ����
		System.out.println("son���޲ι��췽��");
	}
	public Son(String name){
		System.out.println("son�Ĵ��ι��췽��");
	}
}
class ExtendsDemo5{
	public static void main(String[] args){
		Son s1 = new Son();
		System.out.println("-------------");
		Son s2 = new Son("������");
	}
}
/*
father���޲ι��췽��
son���޲ι��췽��
-------------
father���޲ι��췽��
son�Ĵ��ι��췽��
*/