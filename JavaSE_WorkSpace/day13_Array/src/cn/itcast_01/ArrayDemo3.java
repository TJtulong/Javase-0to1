package cn.itcast_01;

//把字符串中的字符进行排序
public class ArrayDemo3 {
	public static void main(String[] args) {
		String s = "dacgebf";
		char[] chs = s.toCharArray();
		bubbleSort(chs);
		String result =s.valueOf(chs);
		System.out.println(result);
	}

	public static void bubbleSort(char[] chs) {
		for (int x = 0; x < chs.length - 1; x++) {
			for (int y = 0; y < chs.length - 1 - x; y++) {
				if (chs[y] > chs[y + 1]) {
					char temp = chs[y];
					chs[y] = chs[y + 1];
					chs[y + 1] = temp;
				}
			}
		}
	}
}
