package cn.itcast_08;
/*
 * 为满足特定的需求，需要自定义异常
 * 自定义异常类必须继承自Exception或者RuntimeException
 */
public class MyException extends Exception {
	public MyException() {}
	
	public MyException(String message) {
		super(message);
	}
}
