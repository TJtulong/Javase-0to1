class ArrayDemo5{
	public static void main(String[] args){
		//�������
		int[] arr = {11,22,33,44,55};
		//�������������
		for(int x = 0;x<5;x++){
			System.out.println(arr[x]);
		}
		
		int[] arr2 = {3,4,5,6,7,5,4,5,4,6,4,6,4,6,4,4,5,6,7,67,7,8,7,5,45,3,6};
		//lengthר�Ż�ȡ����ĳ���
		//��ʽ��������.length ��������ĳ���
		System.out.println(arr2.length);
		for(int x = 0;x<arr2.length;x++){
			System.out.println(arr2[x]);
		}	
		printArray(arr);
	}
	//��������ķ�����void ����
	public static void printArray(int[] arr){
		for(int x = 0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.println(arr[x]);
			}
			else{
				System.out.print(arr[x]+",");
			}
		}
	}
}