package cn.itcast_01;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		printArray(arr);
		selectSort(arr);
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

	public static void selectSort(int arr[]) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[y] < arr[x]) {
					int temp = arr[y];
					arr[y] = arr[x];
					arr[x] = temp;
				}
			}
		}
	}
}
