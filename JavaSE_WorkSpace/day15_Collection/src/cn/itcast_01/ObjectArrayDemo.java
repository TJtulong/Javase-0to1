package cn.itcast_01;

public class ObjectArrayDemo {
	public static void main(String[] args) {
		//����ѧ������
		Student[] students=new Student[5];
		
		Student s1 = new Student("������",22);
		Student s2 = new Student("�ܽ���",40);
		Student s3 = new Student("����",12);
		Student s4 = new Student("��Ȩ",62);
		Student s5 = new Student("C��",33);
		
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		students[3]=s4;
		students[4]=s5;
		
		for(int x=0;x<students.length;x++) {
			System.out.println(students[x].getName()+"---"+students[x].getAge());
		}
				
	}
}
