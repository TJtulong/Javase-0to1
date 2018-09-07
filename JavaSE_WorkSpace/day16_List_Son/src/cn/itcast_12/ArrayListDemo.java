package cn.itcast_12;

import java.util.ArrayList;

import cn.itcast_06.Student;

/*
 * 	集合的嵌套遍历
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建大集合
		ArrayList<ArrayList<Student>> bigArray = new ArrayList<ArrayList<Student>>();

		// 创建第一个小集合
		ArrayList<Student> firstArray = new ArrayList<Student>();
		Student s1 = new Student("唐僧", 30);
		Student s2 = new Student("孙悟空", 29);
		Student s3 = new Student("猪八戒", 28);
		Student s4 = new Student("沙僧", 27);
		Student s5 = new Student("白龙马", 26);

		// 学生进班
		firstArray.add(s1);
		firstArray.add(s2);
		firstArray.add(s3);
		firstArray.add(s4);
		firstArray.add(s5);

		// 班进系统
		bigArray.add(firstArray);

		// 创建第一个小集合
		ArrayList<Student> secondArray = new ArrayList<Student>();
		Student s11 = new Student("诸葛亮", 30);
		Student s22 = new Student("周瑜", 29);
		Student s33 = new Student("司马懿", 28);

		// 学生进班
		secondArray.add(s11);
		secondArray.add(s22);
		secondArray.add(s33);

		// 班进系统
		bigArray.add(secondArray);

		// 创建第一个小集合
		ArrayList<Student> thirdArray = new ArrayList<Student>();
		Student s111 = new Student("宋江", 40);
		Student s222 = new Student("吴用", 29);

		// 学生进班
		thirdArray.add(s111);
		thirdArray.add(s222);

		// 班进系统
		bigArray.add(thirdArray);

		// 遍历
		for (ArrayList<Student> arr : bigArray)
			for (Student s : arr) {
				System.out.println(s.getName() + "---" + s.getAge());
			}

	}
}
