package cn.itcast_08;
/*
 * Ϊ�����ض���������Ҫ�Զ����쳣
 * �Զ����쳣�����̳���Exception����RuntimeException
 */
public class MyException extends Exception {
	public MyException() {}
	
	public MyException(String message) {
		super(message);
	}
}
