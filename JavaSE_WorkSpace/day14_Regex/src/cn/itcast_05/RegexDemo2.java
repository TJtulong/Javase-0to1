package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取字符串中由三个字符组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu";
		// 规则
		String regex = "\\b\\w{3}\\b";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		// 调用匹配器的功能，通过find查找有没有满足条件的字串
		// public boolean find()
		boolean flag = m.find();
		System.out.println(flag);

		// public String group
		String ss = m.group();
		System.out.println(ss);
		// 注意：先find再group
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
