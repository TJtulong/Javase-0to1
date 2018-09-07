package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 通过指定字符集节码字节数组
 * String(byte[] bytes,String charsetName)：解码--->把看不懂的变成看得懂的
 * byte[] getBytes(String charsetName):编码--->把看得懂的变成看不懂的
 * 
 * 编码问题：只要编码解码的格式一致，就不会出问题
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "你好";

		// 默认为GBK
		byte[] bys = s.getBytes();
		//byte[] bys = s.getBytes("UTF-8");// [-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));// [-60, -29, -70, -61]
		
		String ss = new String(bys);
		//String ss = new String(bys,"UTF-8");//???
		System.out.println(ss);
	}
}
