package cn.itcast_12;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

public class ThreadDemo {
	public static void main(String[] args) {
		// 线程安全的类（都加锁了）
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<>();
		Hashtable<String, String> h = new Hashtable<>();

		// Vector是线程安全时才考虑使用的，但也不使用

		// 创建线程安全的List
		List<String> list = Collections.synchronizedList(new ArrayList<String>());

	}
}
