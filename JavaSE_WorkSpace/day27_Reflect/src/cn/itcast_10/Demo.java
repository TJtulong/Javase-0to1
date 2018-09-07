package cn.itcast_10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		int x = 0b100101;
		System.out.println(x);

		int y = 1_3100_1000;
		System.out.println(y);

		ArrayList<String> array = new ArrayList<>();

		method();
	}

	private static void method() {
		// try-with-resourse语句
		// 括号中的自动关闭
		try (FileReader fr = new FileReader("a.txt");
				FileWriter fw = new FileWriter("b.txt");) {
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
