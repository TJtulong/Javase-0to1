/**
*这是针对数组进行操作的工具箱
*@author 王若潇
*@version V.10
*/
public class ArrayTool{
	//把构造方法私有，外界就不能创建对象了
	/**
	*这是私有构造
	*/
	private ArrayTool(){}
	
	//只能通过类名访问静态方法
	/**
	*这是遍历数组的方法，遍历后的格式是：[元素1,元素2...]
	*@param arr 这是要遍历的数组
	*/
	public static void printArray(int[] arr){
		for(int x = 0;x<arr.length;x++){
			if(x == arr.length-1){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
	}
	
	/**
	*这是获取数组最大值的方法
	*@param arr 这是要获取最大值的数组
	*@return 返回数组中的最大值
	*/
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int x =0;x<arr.length;x++){
			if(arr[x]>max){
				max = arr[x];
			}
		}
		return max;
	}
	
	/**
	*这是获取指定元素索引的方法，元素不存在返回-1
	*@param arr 被查找的数组
	*@param value 要查找的元素
	*@return 返回索引
	*/
	public static int getIndex(int[] arr,int value){
		int index = -1;
		for(int x=0;x<arr.length;x++){
			if(arr[x]==value){
				index = x;
				break;
			}
		}
		return index;
	}
}