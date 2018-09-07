/*
包的定义
	package 包名
	多级包用.分开即可
注意事项：
	package语句必须是程序的第一条可执行的代码
	package在一个java文件中只能有一个
	如果没有package，默认表示无包名
带包的编译和运行：
	A.手动式：
		1.编写一个带包的java文件
		2.通过javac命令编译该java文件
		3.手动创建包名
		4.把第二步的class文件放在第三步的最底层包中
		5.回到和包根目录在同一目录的地方，然后运行
			带包运行 java cn.itcast.HelloWorld
	B.自动式
		1.编写文件
		2.javac编译的时候带上-d即可
			javac -d . HelloWorld.java
		3.回到和包根目录在同一目录的地方，然后运行
			带包运行
*/

package cn.itcast;

class HelloWorld{
	public static void main(String[] args){
		System.out.println("hello world");
	}
}