package cn.itcast_05;

import java.util.LinkedList;

/*
 * 	�Զ����ջ����
 */
public class MyStack {
	private LinkedList link;

	public MyStack() {
		link = new LinkedList();
	}

	public void add(Object obj) {
		link.addFirst(obj);
	}

	public Object get() {
		return link.removeFirst();
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}