package cn.itcast_03;

/*
 * public boolean equals(Object obj):指式此对象与其它对象是否相等
 * 这个方法默认比较地址值,意义不大，因此要重写该方法
 * 一般比较变量是否相同
 * 看源码：
 * public boolean equals(Object obj) {
        return (this == obj);
    }
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("xiao", 22);
		Student s2 = new Student("xiao", 22);
		System.out.println(s1 == s2);// false
		Student s3 = s1;
		System.out.println(s1 == s3);// true
		System.out.println("--------------");
		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equals(s1));// true
		System.out.println(s1.equals(s3));// true
		Student s4 = new Student("feng",30);
		System.out.println(s1.equals(s4));//false
		
		Demo d = new Demo();
		System.out.println(s1.equals(d));//ClassCastException
	}
}

class Demo{}
