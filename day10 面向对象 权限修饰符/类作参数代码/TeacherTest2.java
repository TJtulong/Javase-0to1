interface Love{
	public abstract void love();
}

class LoveDemo{
	public Love getLove(){
		return new Teacher();
	}
}

class Teacher implements Love{
	public void love(){
		System.out.println("∞Æ—ß ı");
	}
}

class TeacherTest2{
	public static void main(String[] args){
		LoveDemo ld = new LoveDemo();
		Love l = ld.getLove();
		l.love();
	}
}