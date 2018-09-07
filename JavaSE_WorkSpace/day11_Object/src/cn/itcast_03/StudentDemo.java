package cn.itcast_03;

/*
 * public boolean equals(Object obj):ָʽ�˶��������������Ƿ����
 * �������Ĭ�ϱȽϵ�ֵַ,���岻�����Ҫ��д�÷���
 * һ��Ƚϱ����Ƿ���ͬ
 * ��Դ�룺
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
