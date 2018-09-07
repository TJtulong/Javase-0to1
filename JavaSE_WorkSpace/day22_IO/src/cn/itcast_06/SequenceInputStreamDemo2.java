package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * 多个文件合并
 * a.txt+b.txt+c.txt--->copy.txt
 */
public class SequenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException{
		/*
		 * SequenceInputStream(Enumeration e)
		 * Enumeration是Vector中的一个方法的返回值
		 * Enumeration<E> elements
		 */
		
		Vector<InputStream> v = new Vector<InputStream>();
		InputStream s1 = new FileInputStream("a.txt");
		InputStream s2 = new FileInputStream("b.txt");
		InputStream s3 = new FileInputStream("c.txt");
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys);
		}

		bos.close();
		sis.close();
		
	}
}
