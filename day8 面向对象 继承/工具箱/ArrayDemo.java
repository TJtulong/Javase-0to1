class ArrayDemo{
	public static void main(String[] args){
		//��������
		int[] arr = {18,55,37,46,19};
		//��������
		//printArray(arr);//��ֻ̬�ܷ��ʾ�̬
		//�Ǿ�̬����
		//ArrayDemo ad = new ArrayDemo();
		//ad.printArray(arr);
		/*�������������ĵ���
		ArrayTool at = new ArrayTool();
		at.printArray(arr);
		*/
		//��ֱ̬������������
		ArrayTool.printArray(arr);
		int max = ArrayTool.getMax(arr);
		System.out.println("max="+max);
		int index = ArrayTool.getIndex(arr,55);
		System.out.println("index="+index);
	}
}