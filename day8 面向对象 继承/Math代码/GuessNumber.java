import java.util.Scanner;
class GuessNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		while(true){
			System.out.println("请输入100以内的数：");
			int guessNumber = sc.nextInt();
			if(guessNumber>num){
				System.out.println("你猜的数字"+guessNumber+"大了");
			}else if(guessNumber>num){
				System.out.println("你猜的数字"+guessNumber+"小了");
			}else{
				System.out.println("猜对了");
				break;
			}
		}
		
	}
}