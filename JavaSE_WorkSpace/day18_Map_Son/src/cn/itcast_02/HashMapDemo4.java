package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Student,String>
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		HashMap<Student,String> hm= new HashMap<>();
		
		Student s1 = new Student("ÖÜĞÇ³Û", 58);
		Student s2 = new Student("ÁõµÂ»ª", 55);
		Student s3 = new Student("Áº³¯Î°", 60);
		Student s4 = new Student("Áõ¼ÎÁá", 63);
		Student s5= new Student("ÁõµÂ»ª", 55);
		
		hm.put(s1, "8888");
		hm.put(s2, "5555");
		hm.put(s3, "7777");
		hm.put(s4, "6666");
		hm.put(s5, "1111");
		
		Set<Student> set=hm.keySet();
		for(Student key:set) {
			String value=hm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
	}
}
