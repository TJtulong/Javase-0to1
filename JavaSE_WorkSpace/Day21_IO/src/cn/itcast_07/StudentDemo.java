package cn.itcast_07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生值（姓名,语文成绩,数学成绩,英语成绩）,按总分由高到低排序
 */
public class StudentDemo {
	public static void main(String[] args) throws IOException {
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num1 = s2.getSum() - s1.getSum();
				int num2 = num1 == 0 ? s1.getChinese() - s2.getChinese() : num1;
				int num3 = num2 == 0 ? s2.getEnglish() - s2.getEnglish() : num2;
				int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
				return num4;
			}
		});

		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请录入第" + x + "个学生的信息");
			System.out.print("姓名");
			String name = sc.nextLine();
			System.out.print("语文成绩");
			int chinese = sc.nextInt();
			System.out.print("数学成绩");
			int math = sc.nextInt();
			System.out.print("英语成绩");
			int english = sc.nextInt();

			Student s = new Student(name, chinese, math, english);

			ts.add(s);
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		bw.write("学生信息如下");
		bw.newLine();
		bw.write("姓名,语文成绩,数学成绩,英语成绩");
		bw.newLine();
		bw.flush();

		for (Student s : ts) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName() + ",").append(s.getChinese() + ",")
			.append(s.getMath() + ",").append(s.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}

		bw.close();

	}
}
