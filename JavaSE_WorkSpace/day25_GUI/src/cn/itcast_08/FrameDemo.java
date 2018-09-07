package cn.itcast_08;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("一级菜单");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());

		// 创建菜单栏
		MenuBar mb = new MenuBar();
		// 创建菜单
		Menu m = new Menu("文件");
		// 创建菜单项
		MenuItem mi = new MenuItem("退出系统");

		m.add(mi);
		mb.add(m);
		f.setMenuBar(mb);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		mi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);
	}
}
