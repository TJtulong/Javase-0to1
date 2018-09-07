package cn.itcast_01;

import java.awt.Frame;

/*
 * 窗体
 */
public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame();
		// Frame f = new Frame("helloworld");

		// 设置窗体标题
		f.setTitle("helloworld");

		// 调用一个方法，设置让方法可见
		// f.show();
		f.setVisible(true);

		// 设置窗体大小
		f.setSize(400, 300);// 默认为像素

		// 设置窗体位置
		f.setLocation(400, 200);
	}
}
