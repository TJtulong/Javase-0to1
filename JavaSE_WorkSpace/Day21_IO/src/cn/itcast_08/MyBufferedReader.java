package cn.itcast_08;

import java.io.IOException;
import java.io.Reader;

/*
 * ��Readerģ��BufferedReader��readLine()����
 * \r-->13
 * \n-->10
 */
public class MyBufferedReader {
	private Reader r;
	
	public MyBufferedReader(Reader r) {
		this.r=r;
	}
	
	public String readLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while((ch=r.read())!=-1) {
			if(ch=='\r') {
				continue;
			}
			if(ch=='\n') {
				return sb.toString();
			}else {
				sb.append((char)ch);
			}
		}
		
		//Ϊ�˷�ֹ���ݶ�ʧ���ж�sb�ĳ��Ȳ��ܴ�����
		if(sb.length()>0) {
			return sb.toString();
		}
		return null;
	}
	
	public void close() throws IOException {
		this.r.close();
	}
}
