package cn.itcast_03;
/*
 * 	分割功能
 * 		String类的public String[] split(String regex)
 * 		根据正则表达式的匹配拆分次字符串
 * 	举例
 * 		搜索好友
 * 			性别：女
 * 			范围：18-24
 */
public class RegexDemo {
	public static void main(String[] args) {
		String ages="18-24";
		
		String regex="-";
		
		String[] strArray=ages.split(regex);
		
		int startage=Integer.parseInt(strArray[0]);
		int endtage=Integer.parseInt(strArray[1]);
	}
}
