import java.util.Scanner;
class GuessNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		while(true){
			System.out.println("������100���ڵ�����");
			int guessNumber = sc.nextInt();
			if(guessNumber>num){
				System.out.println("��µ�����"+guessNumber+"����");
			}else if(guessNumber>num){
				System.out.println("��µ�����"+guessNumber+"С��");
			}else{
				System.out.println("�¶���");
				break;
			}
		}
		
	}
}