package cn.itcast_01;

import java.awt.Frame;

/*
 * ����
 */
public class FrameDemo {
	public static void main(String[] args) {
		// �����������
		Frame f = new Frame();
		// Frame f = new Frame("helloworld");

		// ���ô������
		f.setTitle("helloworld");

		// ����һ�������������÷����ɼ�
		// f.show();
		f.setVisible(true);

		// ���ô����С
		f.setSize(400, 300);// Ĭ��Ϊ����

		// ���ô���λ��
		f.setLocation(400, 200);
	}
}
