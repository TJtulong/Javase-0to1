package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ�ַ������������ַ���ɵĵ���
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu";
		// ����
		String regex = "\\b\\w{3}\\b";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		// ����ƥ�����Ĺ��ܣ�ͨ��find������û�������������ִ�
		// public boolean find()
		boolean flag = m.find();
		System.out.println(flag);

		// public String group
		String ss = m.group();
		System.out.println(ss);
		// ע�⣺��find��group
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
