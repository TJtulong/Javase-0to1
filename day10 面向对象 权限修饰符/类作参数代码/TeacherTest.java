//定义一个爱好接口
interface Love{
	public abstract void love();
}

class LoveDemo{
	public void method(Love l){
		l.love();
	}
}

//定义具体类实现方法
class Teacher implements Love{
	public void love(){
		System.out.println("爱学术");
	}
}

class TeacherTest{
	public static void main(String[] args){
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		ld.method(l);
	}
}