class Demo{
	public int sum(int a,int b){
		return a+b;
	}
}

class Test{
	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.sum(10,20));
	}
}