package cn.itcast_04;

import java.io.File;

/*
 * 重命名功能：public boolean renameTo(File dest)
 * 路径以盘符开始:绝对路径
 * 路径不以盘符开始：相对路径
 * 如果路径名相同就是改名，如果路径名不同就是剪切+改名
 */
public class FileDemo {
	public static void main(String[] args) {
		File file =new File("裂缝图1.jpg");
		
		//修改文件名为裂缝图
		File newfile = new File("裂缝图.jpg");
		file.renameTo(newfile);
		
		File newfile2 = new File("c:\\Users\\TJtulong\\Desktop\\裂缝图.jpg");
		System.out.println("rename:"+newfile.renameTo(newfile2));
		//文件出现在桌面上
		
	}
}
