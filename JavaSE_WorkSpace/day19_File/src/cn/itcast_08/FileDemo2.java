package cn.itcast_08;

import java.io.File;
import java.io.FilenameFilter;

/*
 * �ж�E�����Ƿ��к�׺��Ϊ.jpg���ļ������������ļ���
 * �ļ���������
 * public String[] list(FileNameFilter filter)
 * public File[] listFiles(FileNameFilter filter)
 */
public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("c:\\Users\\TJtulong\\Desktop");

		String[] strArray = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// return false;
				File file = new File(dir, name);
				boolean flag = file.isFile();
				boolean flag2 = name.endsWith(".pdf");
				return flag && flag2;
			}
		});

		for (String s : strArray) {
			System.out.println(s);
		}
	}
}
