package cn.itcast_01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

public class FrameDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("���÷������õ�ǰ���ϵ");

		// f.setSize(400,300);
		Dimension d = new Dimension(400, 300);
		f.setSize(d);

		// f.setLocation(400, 200);
		Point p = new Point(400, 200);
		f.setLocation(p);

		// һ������ȷ��λ��
		f.setBounds(400, 200, 400, 300);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		f.setVisible(true);
	}
}
