class Variable{
	//��Ա����
	int num = 10;
	public static void show(){
		int num2 = 20;//�ֲ�����
	}
}
class VariableDemo{
	public static void main(String[] args){
		Variable v = new Variable();
		System.out.println(v.num);
	}
}