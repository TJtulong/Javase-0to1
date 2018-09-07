class Fu{
	private String name = "ÍõÈôäì";
	public void show(){
		System.out.println(name);
	}
}

class Zi extends Fu{
	public Zi(String name){
		//this.name = name;
	}
}

class Test{
	public static void main(String[] args){
		Zi z = new Zi("ÍõÈôäì");
		z.show();
	}
}