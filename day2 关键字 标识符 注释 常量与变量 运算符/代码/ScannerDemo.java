/*
ʵ�ּ������ݵ�¼��
A.����
import java.util.Scanner;//(��class����)
B.��������¼�����
Scanner sc = new Scanner(System.in);
C.ͨ�������ȡ����
int x = sc.nextInt();
*/
import java.util.Scanner;
class ScannerDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ݣ�");
		int x = sc.nextInt();
		System.out.println("��������ǣ�"+x);
	}
}