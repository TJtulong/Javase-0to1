package cn.itcast_07;
/*
 * 	统计大串中小串的个数
 */
public class StringTest4 {
	public static void main(String[] args) {
		String s1 = "woaijavawozhenaijavawozhendeaijavawoshizhenaijavaniaijavama";
		String s2="java";
		System.out.println("出现次数为"+counts(s1, s2));
			
	}
	public static int counts(String s1,String s2) {
		int num=0;
		int index=0;
		index=s1.indexOf(s2);
		while(index!=-1) {
			num++;
			index=index+s2.length();
			s1=s1.substring(index);
			index=s1.indexOf(s2);			
		}	
		return num;
	}
}
