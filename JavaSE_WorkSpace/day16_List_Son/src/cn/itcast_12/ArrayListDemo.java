package cn.itcast_12;

import java.util.ArrayList;

import cn.itcast_06.Student;

/*
 * 	���ϵ�Ƕ�ױ���
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// �����󼯺�
		ArrayList<ArrayList<Student>> bigArray = new ArrayList<ArrayList<Student>>();

		// ������һ��С����
		ArrayList<Student> firstArray = new ArrayList<Student>();
		Student s1 = new Student("��ɮ", 30);
		Student s2 = new Student("�����", 29);
		Student s3 = new Student("��˽�", 28);
		Student s4 = new Student("ɳɮ", 27);
		Student s5 = new Student("������", 26);

		// ѧ������
		firstArray.add(s1);
		firstArray.add(s2);
		firstArray.add(s3);
		firstArray.add(s4);
		firstArray.add(s5);

		// ���ϵͳ
		bigArray.add(firstArray);

		// ������һ��С����
		ArrayList<Student> secondArray = new ArrayList<Student>();
		Student s11 = new Student("�����", 30);
		Student s22 = new Student("���", 29);
		Student s33 = new Student("˾��ܲ", 28);

		// ѧ������
		secondArray.add(s11);
		secondArray.add(s22);
		secondArray.add(s33);

		// ���ϵͳ
		bigArray.add(secondArray);

		// ������һ��С����
		ArrayList<Student> thirdArray = new ArrayList<Student>();
		Student s111 = new Student("�ν�", 40);
		Student s222 = new Student("����", 29);

		// ѧ������
		thirdArray.add(s111);
		thirdArray.add(s222);

		// ���ϵͳ
		bigArray.add(thirdArray);

		// ����
		for (ArrayList<Student> arr : bigArray)
			for (Student s : arr) {
				System.out.println(s.getName() + "---" + s.getAge());
			}

	}
}
