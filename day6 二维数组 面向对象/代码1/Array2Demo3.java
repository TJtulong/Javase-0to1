/*
格式3
静态初始化
数据类型[][] 数组名 = new 数据类型[][]{{元素1,元素2,元素3},{元素4,元素5},{元素6}};
数据类型[][] 数组名 = {{元素1,元素2,元素3},{元素4,元素5},{元素6}};
可以动态给出列数
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