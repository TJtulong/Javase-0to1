class Fu{
	public void show(){
		System.out.println("show Fu");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("show Zi");
	}
	public void method(){
		System.out.println("method Zi");
	}
}

class DuoTaiDemo{
	public static void main(String[] args){
		Fu f =new Zi();
		f.show();
		//f.method();�Ҳ�������
		/*
		�����������
		Zi z = new Zi();
		z.show();
		z.method();
		*/
		
		//�Ѹ������ø�ֵ���ӵ����� ǿ��ת��
		Zi z = (Zi) f;
		z.show();
		z.method();
	}
}