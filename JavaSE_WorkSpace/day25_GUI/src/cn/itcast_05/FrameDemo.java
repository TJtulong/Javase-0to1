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
		Frame f = new Frame("����ת��");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());

		// �����ı���
		TextField tf = new TextField(20);
		Button bu = new Button("����ת��");
		// �����ı���
		TextArea ta = new TextArea(10, 40);

		// ������
		f.add(tf);
		f.add(bu);
		f.add(ta);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// �԰�ť����¼�
		bu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�ı����ֵ
				String tf_str = tf.getText().trim();
				// ׷�Ӹ��ı���
				ta.append(tf_str + "\r\n");
				// ����ı���
				tf.setText("");
				// ��ȡ���
				tf.requestFocus();
			}
		});
		f.setVisible(true);
	}
}
