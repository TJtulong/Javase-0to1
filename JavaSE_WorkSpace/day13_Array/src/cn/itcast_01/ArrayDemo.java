package cn.itcast_01;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);

	}

	// ±éÀúÊı×é
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.println(arr[x] + "]");
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
	}

	// Ã°ÅİÅÅĞò
	public static void bubbleSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}
}
