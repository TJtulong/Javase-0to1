interface AnimalTrain{
	public abstract void jump();
}

abstract class Dog implements AnimalTrain{}

class Cat implements AnimalTrain{
	public void jump(){
		System.out.println("√®ø…“‘Ã¯∏ﬂ");
	}
}

class InterfaceDemo{
	public static void main(String[] args){
		AnimalTrain at = new Cat();
		at.jump();
	}
}