//��Աλ����

class Outer{
	private int num = 10;
	//��Աλ��
	class Inner{
		public void show(){
			System.out.println(num);
		}
	}
}


class InnerClassDemo2{
	public static void main(String[] args){
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}