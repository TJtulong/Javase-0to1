package cn.itcast_02;

//List±éÀú
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("hello");
		list.add("world");
		list.add("java");

		for (int x = 0; x < list.size(); x++) {
			String s = (String) list.get(x);
			System.out.println(s);
		}

		// µü´úÆ÷±éÀú
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
