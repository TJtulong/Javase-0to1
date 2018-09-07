//Math类在lang包下，因此不需要导包
//没有构造方法因为成员都是静态的
//获取随机数 public static double random()

class MathDemo{
	public static void main(String[] args){
		double d = Math.random();
		System.out.println(d);
		//需求：获取1-100之间的随机数
	int num = (int)(Math.random()*100)+1;
	System.out.println(num);
	}
}

