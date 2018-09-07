package cn.itcast_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���û����ȷ˵���������ַ�����˵��Ĭ�ϰ����������ͷ��࣬���ǰ�����
 * ���ۣ������ࣩ
 * �ֽ���������InputStream
 * �ֽ������: OutPutStream JDK1.0
 * �ַ�������: Reader
 * �ַ������: Writer
 * 
 * ������һ���ı��ļ�������"hello IO"
 * OutputStream�ǳ����࣬����ʵ��������Ҫ��һ�����������FileOutputStream
 * ÿ�ֻ�������඼���Ը�������Ϊ��׺��
 * 
 * ���췽��:
 * 		FileOutputStream(File file)
 * 		FileOutputStream(String name)
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������(���ַ�ʽ)
		//File file = new File("file.txt");
		//FileOutputStream fos = new FileOutputStream(file);
		
		FileOutputStream fos = new FileOutputStream("fos.txt");
		/*
		 * �����ֽ�����������������飺
		 * 1.����ϵͳ���ܴ����ļ�
		 * 2.����fos����
		 * 3.��fos����ָ���ļ�
		 */
		
		//д����
		fos.write("Hello,IO".getBytes());
		
		//�ͷ���Դ
		fos.close();
		/*
		 * Ϊʲôһ��Ҫclose
		 * 1.�������������������Ա���������������
		 * 2.֪ͨϵͳȥ�ͷŸ��ļ���ص���Դ
		 */
		//fos.write("java".getBytes());����
	}
}
