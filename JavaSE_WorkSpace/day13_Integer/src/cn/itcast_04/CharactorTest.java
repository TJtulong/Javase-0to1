package cn.itcast_04;

import java.util.Scanner;

public class CharactorTest {
	public static void main(String[] args) {
		int bigcount = 0;
		int smallcount = 0;
		int numcount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String line = sc.nextLine();

		char[] chs = line.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			char ch = chs[x];
			if (Character.isUpperCase(ch)) {
				bigcount++;
			} else if (Character.isLowerCase(ch)) {
				smallcount++;
			} else if (Character.isDigit(ch)) {
				numcount++;
			}
		}
		System.out.println(bigcount + "  " + smallcount + "   " + numcount);
	}
}
