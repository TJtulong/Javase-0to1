package cn.itcast_04;

import java.io.File;

/*
 * ���������ܣ�public boolean renameTo(File dest)
 * ·�����̷���ʼ:����·��
 * ·�������̷���ʼ�����·��
 * ���·������ͬ���Ǹ��������·������ͬ���Ǽ���+����
 */
public class FileDemo {
	public static void main(String[] args) {
		File file =new File("�ѷ�ͼ1.jpg");
		
		//�޸��ļ���Ϊ�ѷ�ͼ
		File newfile = new File("�ѷ�ͼ.jpg");
		file.renameTo(newfile);
		
		File newfile2 = new File("c:\\Users\\TJtulong\\Desktop\\�ѷ�ͼ.jpg");
		System.out.println("rename:"+newfile.renameTo(newfile2));
		//�ļ�������������
		
	}
}
