/*
��ʽ2
��������[][] ������ = new ��������[m][]
���Զ�̬��������
*/
class Array2Demo2{
	public static void main(String[] args){
		int[][] arr = new int[3][];
		System.out.println(arr); //��ֵַ
		System.out.println(arr[0]); //null
		
		//��̬��Ϊÿһ��һά�������ռ�
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];
		System.out.println(arr[0]); //��ֵַ
		System.out.println(arr[0][0]); //0
		
		arr[1][0] = 1;//��ά����Ԫ��
	}
}