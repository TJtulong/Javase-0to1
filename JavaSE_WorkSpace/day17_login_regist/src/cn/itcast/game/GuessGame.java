package cn.itcast.game;

import java.net.StandardSocketOptions;
import java.util.Scanner;

/**
 * ���ǲ�����С��Ϸ
 * 
 * @author TJtulong
 * @version V1.0
 */
public class GuessGame {
	private GuessGame() {
	}

	public static void start() {
		int number = (int) (Math.random() * 100) + 1;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������1-100�����ݣ�");
			int guessnumber = sc.nextInt();

			if (guessnumber > number) {
				System.out.println("��µô���");
			} else if (guessnumber < number) {
				System.out.println("��µ�С��");
			} else {
				System.out.println("�������");
				break;
			}
		}
	}
}
