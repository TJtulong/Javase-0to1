package cn.itcast_10;
/*
 * 	实现类在实现接口的时候：
 * 		1.已知类型
 * 		2.未知类型
 */
/*public class InterImpl implements Inter<String>{

	@Override
	public void show(String t) {
		System.out.println(t);
	}	
}*/

//第二种情况
public class InterImpl<T> implements Inter<T>{

	@Override
	public void show(T t) {
		System.out.println(t);
	}
	
}
