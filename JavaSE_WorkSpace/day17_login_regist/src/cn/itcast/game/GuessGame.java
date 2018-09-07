package cn.itcast.game;

import java.net.StandardSocketOptions;
import java.util.Scanner;

/**
 * 这是猜数字小游戏
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
			System.out.println("请输入1-100的数据：");
			int guessnumber = sc.nextInt();

			if (guessnumber > number) {
				System.out.println("你猜得大了");
			} else if (guessnumber < number) {
				System.out.println("你猜得小了");
			} else {
				System.out.println("你猜中了");
				break;
			}
		}
	}
}
