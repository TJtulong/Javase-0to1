/*
������
*/
import java.util.Scanner;
class ArrayTest3{
	public static void main(String[] args){
		String[] strArray = {"����һ","���ڶ�","������","������","������","������","������"};
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����֣�0~6��");
		int index = sc.nextInt();
		System.out.println("����ҵ��ǣ�"+strArray[index]);
	}
}