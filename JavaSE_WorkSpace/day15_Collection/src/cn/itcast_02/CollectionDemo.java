package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection 是集合的顶级接口，它的子体系有重复有唯一、有有序有无序
 * 		功能：
 * 		1.添加 	boolean add(Object o):添加一个元素
 * 				boolean addAll(Collection c):添加一个集合
 * 		2.删除	void clear():移除所有元素
 * 				boolean remove(Object o):移除一个元素
 *				boolean remove(Collection c)：移除一个集合的元素
 * 		3.判断	boolean contains(Object o):判断集合中是否包含指定的集合元素
 * 				boolean contains(Collection c)
 * 				boolean isEmpty():判断集合是否为空
 * 		4.获取	Iterator<E> iterator():重点
 * 		5.长度	int size() :元素的个数
 * 		6.交集	boolean retainAll(Collection c):两个集合都有的元素
 * 		7.把集合转为数组	Object[] toArray()
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection c =new ArrayList();
		
		//boolean add(Object o)
		//System.out.println("add:"+c.add("hello"));//永远都为true
		c.add("hello");
		c.add("world");
		c.add("java");
		System.out.println("c="+c);
		
		//void clear()
		//c.clear();
		//System.out.println("c="+c);
		
		//boolean remove(Object o)
		System.out.println(c.remove("hello"));
		System.out.println(c.remove("javaee"));
		System.out.println("c="+c);
		c.add("hello");
		
		//boolean contains(Object o)
		System.out.println("contains="+c.contains("hello"));
		System.out.println("contains="+c.contains("android"));
		
		//boolean isEmpty()
		System.out.println("isempty="+c.isEmpty());
		
		//int size()
		System.out.println("size="+c.size());
	}
}
