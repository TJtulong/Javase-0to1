package cn.itcast_07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ��ֵ������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ���,���ܷ��ɸߵ�������
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
			System.out.println("��¼���" + x + "��ѧ������Ϣ");
			System.out.print("����");
			String name = sc.nextLine();
			System.out.print("���ĳɼ�");
			int chinese = sc.nextInt();
			System.out.print("��ѧ�ɼ�");
			int math = sc.nextInt();
			System.out.print("Ӣ��ɼ�");
			int english = sc.nextInt();

			Student s = new Student(name, chinese, math, english);

			ts.add(s);
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		bw.write("ѧ����Ϣ����");
		bw.newLine();
		bw.write("����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
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
