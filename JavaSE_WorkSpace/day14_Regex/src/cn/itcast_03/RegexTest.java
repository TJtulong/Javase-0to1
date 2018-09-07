package cn.itcast_03;

public class RegexTest {
	public static void main(String[] args) {
		String s1="aa,bb,cc";
		String[] str1Array=s1.split(",");
		for(int x=0;x<str1Array.length;x++) {
			System.out.println(str1Array[x]);
		}
		System.out.println("------------");
		
		String s2="aa.bb.cc";
		String[] str2Array=s1.split("\\.");
		for(int x=0;x<str2Array.length;x++) {
			System.out.println(str2Array[x]);
		}
		System.out.println("------------");
		
		String s3="aa  bb             cc";
		String[] str3Array=s1.split(" +");
		for(int x=0;x<str3Array.length;x++) {
			System.out.println(str3Array[x]);
		}
		System.out.println("------------");
		
		//硬盘上的路径用\\代替\
		String s4="C:\\Users\\TJtulong\\Desktop\\java\\day14";
		String[] str4Array=s4.split("\\\\");
		for(int x=0;x<str4Array.length;x++) {
			System.out.println(str4Array[x]);
		}
		System.out.println("------------");
	}
}
