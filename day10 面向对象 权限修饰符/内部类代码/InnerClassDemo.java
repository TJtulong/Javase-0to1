class Outer{
	private int num = 10;
	
	class Inner{
		public void show(){
			System.out.println(num);
		}
	}
	
	public void method(){
		Inner i = new Inner();
		i.show();
	}
}

class InnerClassDemo{
	public static void main(String[] args){
		
	}
}