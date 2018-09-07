/*
导包：
	格式： import 包名;
	这种方法导入的是类的名称
	注意:用谁导谁
面试题:
	package import class 有没有顺序关系？
	有package>import>class
	package:只能有一个
	import：可以有多个
	class：可以有多个，建议是一个
*/

package cn.itcast;

import com.xiao.Demo;

class Test{
	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.sum(3,4));
	}
}