package cn.itcast_08;

import java.io.IOException;
import java.io.Reader;

/*
 * 用Reader模拟BufferedReader的readLine()功能
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
		
		//为了防止数据丢失，判断sb的长度不能大于零
		if(sb.length()>0) {
			return sb.toString();
		}
		return null;
	}
	
	public void close() throws IOException {
		this.r.close();
	}
}
