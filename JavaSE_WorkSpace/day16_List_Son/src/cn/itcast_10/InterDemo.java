package cn.itcast_10;

public class InterDemo {
	public static void main(String[] args) {
		/*Inter<String> i = new InterImpl();
		i.show("hello");*/
		
		//�ڶ������
		Inter<String> i =new InterImpl<String>();
		i.show("hello");
		
		Inter<Integer> ii = new InterImpl<Integer>();
		ii.show(100);
	}
}
