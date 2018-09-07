package cn.itcast_02;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»Î” œ‰");
		String email = sc.nextLine();

		// String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
		boolean flag = email.matches(regex);
		System.out.println(flag);
	}
}
