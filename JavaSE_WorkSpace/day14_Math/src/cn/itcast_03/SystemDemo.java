package cn.itcast_03;
/*
 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ����
 * ������
 * 		public static void gc()
 */
public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("xiao",22);
		System.out.println(p);
		
		p=null;
		System.gc();//��ǰ���󱻻�����Person [name=xiao, age=22]
	}
}
