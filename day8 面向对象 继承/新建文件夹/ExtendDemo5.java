class Phone{
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
}

class NewPhone extends Phone{
	public void call(String name){
		//System.out.println("给"+name+"打电话");
		super.call(name);
		System.out.println("可以听前期预报了");
	}
}

class ExtendsDemo5{
	public static void main(String[] args){
		NewPhone np = new NewPhone();
		np.call("王若潇");
	}
}