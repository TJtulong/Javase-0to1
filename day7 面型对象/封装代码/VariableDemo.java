class Variable{
	//成员变量
	int num = 10;
	public static void show(){
		int num2 = 20;//局部变量
	}
}
class VariableDemo{
	public static void main(String[] args){
		Variable v = new Variable();
		System.out.println(v.num);
	}
}