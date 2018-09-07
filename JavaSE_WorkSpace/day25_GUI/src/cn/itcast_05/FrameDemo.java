package cn.itcast_05;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("数据转移");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());

		// 创建文本框
		TextField tf = new TextField(20);
		Button bu = new Button("数据转移");
		// 创建文本域
		TextArea ta = new TextArea(10, 40);

		// 添加组件
		f.add(tf);
		f.add(bu);
		f.add(ta);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 对按钮添加事件
		bu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取文本框的值
				String tf_str = tf.getText().trim();
				// 追加给文本域
				ta.append(tf_str + "\r\n");
				// 清空文本框
				tf.setText("");
				// 获取光标
				tf.requestFocus();
			}
		});
		f.setVisible(true);
	}
}
