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
import java.io.IOException;

public class FrameDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("多级菜单");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());

		// 创建菜单栏
		MenuBar mb = new MenuBar();
		// 创建菜单
		Menu m1 = new Menu("文件");
		Menu m2 = new Menu("更改名称");
		// 创建菜单项
		MenuItem mi1 = new MenuItem("好好学习");
		MenuItem mi2 = new MenuItem("天天向上");
		MenuItem mi3 = new MenuItem("恢复标题");
		MenuItem mi4 = new MenuItem("打开记事本");
		MenuItem mi5 = new MenuItem("退出系统");

		m2.add(mi1);
		m2.add(mi2);
		m2.add(mi3);
		m1.add(m2);
		m1.add(mi4);
		m1.add(mi5);
		mb.add(m1);
		f.setMenuBar(mb);
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(mi1.getLabel());
			}
		});
		
		mi4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("notepad");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		mi5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);
	}
}
