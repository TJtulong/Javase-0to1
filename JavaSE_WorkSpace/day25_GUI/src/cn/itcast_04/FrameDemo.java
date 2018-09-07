package cn.itcast_04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 把按钮添加到窗体，并对按钮添加点击事件
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("添加按钮");
		f.setBounds(400, 200, 400, 300);
		//设置布局为流式布局
		f.setLayout(new FlowLayout());
		
		Button bu = new Button("我是按钮");
		bu.setSize(20,10);
		
		f.add(bu);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("点一点");
			}
		});
		
		f.setVisible(true);
	}
}
