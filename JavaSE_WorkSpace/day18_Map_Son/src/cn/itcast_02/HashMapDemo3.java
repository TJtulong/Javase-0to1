package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

//HashMap<String,Student>
public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<>();

		Student s1 = new Student("ÖÜĞÇ³Û", 58);
		Student s2 = new Student("ÁõµÂ»ª", 55);
		Student s3 = new Student("Áº³¯Î°", 60);
		Student s4 = new Student("Áõ¼ÎÁá", 63);

		hm.put("9527", s1);
		hm.put("9522", s2);
		hm.put("9524", s3);
		hm.put("9529", s4);

		Set<String> set = hm.keySet();
		for (String key : set) {
			Student s = hm.get(key);
			System.out.println(key + "----" + s.getName() + "----" + s.getAge());
		}
	}
}
