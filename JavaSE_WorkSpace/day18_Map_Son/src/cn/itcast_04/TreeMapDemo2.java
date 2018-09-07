package cn.itcast_04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import cn.itcast_02.Student;

/*
 * TreeMap<Student,String>
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getAge() - s1.getAge();// �����ɴ�С
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				return num2;
			}
		});

		Student s1 = new Student("���ǳ�", 58);
		Student s2 = new Student("���»�", 55);
		Student s3 = new Student("����ΰ", 60);
		Student s4 = new Student("������", 63);
		Student s5 = new Student("���»�", 55);

		tm.put(s1, "���");
		tm.put(s2, "���");
		tm.put(s3, "����");
		tm.put(s4, "��½");
		tm.put(s5, "���");

		Set<Student> set = tm.keySet();
		for (Student key : set) {
			String value = tm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}
}
