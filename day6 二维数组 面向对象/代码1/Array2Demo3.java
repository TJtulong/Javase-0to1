/*
��ʽ3
��̬��ʼ��
��������[][] ������ = new ��������[][]{{Ԫ��1,Ԫ��2,Ԫ��3},{Ԫ��4,Ԫ��5},{Ԫ��6}};
��������[][] ������ = {{Ԫ��1,Ԫ��2,Ԫ��3},{Ԫ��4,Ԫ��5},{Ԫ��6}};
���Զ�̬��������
*/
class Array2Demo3{
	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5},{6}};
		System.out.println(arr); 
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);		
		arr[1][0] = 1;
	}
}