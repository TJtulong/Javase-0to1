class Phone{
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
}

class NewPhone extends Phone{
	public void call(String name){
		//System.out.println("��"+name+"��绰");
		super.call(name);
		System.out.println("������ǰ��Ԥ����");
	}
}

class ExtendsDemo5{
	public static void main(String[] args){
		NewPhone np = new NewPhone();
		np.call("������");
	}
}