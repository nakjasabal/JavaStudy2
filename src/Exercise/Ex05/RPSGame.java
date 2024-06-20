package Exercise.Ex05;

import java.util.Random;
import java.util.Scanner;

/*
가위 바위 보 게임 구현하기(Rock-Paper-Scissors Game)

게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
1. 난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
2. 사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
3. 승부를 판단하여 출력한다.
4. 1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
5. 숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
6. 게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 
재시작(1), 종료(0)
7. 0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.
 */
public class RPSGame {

	public static void rpsGame() {
		
		/*
		Random() : 난수를 생성하기 위한 클래스
			난수를 생성할때 다른 패턴의 난수를 생성하기 위해서는
			seed(씨앗)를 항상 다르게 심어줘야 한다. 이를 위해
			1000분의 1초단위로 현재시간을 반환해주는 
			System.currentTimeMillis()메소드를 사용한다.
			
			씨드가 동일하여 항상 같은 패턴으로 생성되는 난수를
			가짜난수(Pseudo Number)라고 한다.			
		 */
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		//System.out.println("현재시간:"+System.currentTimeMillis());
				
		//int rndNumber = random.nextInt(100);
		//System.out.println("생성된 난수:"+ rndNumber);
					
		Scanner scan = new Scanner(System.in);
		
		//게임진행
		while(true) {
			
			//게임을 진행할때마다 난수생성
			/*
			nextInt(100) => 0~99사이의 난수가 생성됨
			 */
			int rndNumber = random.nextInt(1000);
			
			/*
			컴퓨터가 생각한 숫자 구하기
				가위(1)바위(2)보(3) 즉 1~3까지의 난수가 필요하므로
				3으로 나눈 나머지에 1을 더한다.
			 */
			int comNumber = rndNumber % 3 + 1;
			//System.out.println("컴퓨터가 생각한 숫자:"+ comNumber);
			
			/*
			사용자로부터 가위,바위,보 또는 종료에 해당하는 정수를
			입력받는다.
			 */
			System.out.println("가위바위보 중 하나를 선택하세요");
			System.out.print("가위(1), 바위(2), 보(3), 종료(0):");
			int userNumber = scan.nextInt();
			
			//승부판단
			//방법1
			/*if(userNumber==1 && comNumber==1) 
				System.out.println("유저:가위, 컴:가위\n비겼습니다.");
			else if(userNumber==1 && comNumber==2) 
				System.out.println("유저:가위, 컴:바위\n졌습니다.");
			else if(userNumber==1 && comNumber==3) 
				System.out.println("유저:가위, 컴:보\n이겼습니다.");
			else if(userNumber==2 && comNumber==1) 
				System.out.println("유저:바위, 컴:가위\n이겼습니다.");
			else if(userNumber==2 && comNumber==2) 
				System.out.println("유저:바위, 컴:바위\n비겼습니다.");
			else if(userNumber==2 && comNumber==3) 
				System.out.println("유저:바위, 컴:보\n졌습니다.");
			else if(userNumber==3 && comNumber==1) 
				System.out.println("유저:보, 컴:가위\n졌습니다.");
			else if(userNumber==3 && comNumber==2) 
				System.out.println("유저:보, 컴:바위\n이겼습니다.");
			else if(userNumber==3 && comNumber==3) 
				System.out.println("유저:보, 컴:보\n비겼습니다.");			
			
			if(!(userNumber==1 || userNumber==2 || userNumber==3 
					|| userNumber==0))				
				System.out.println("가위바위보 할줄 모르삼? 다시내삼!");*/
			
			
			//방법2		
			if(userNumber>=1 && userNumber<=3) {
				System.out.printf("사용자:%s, 컴퓨터:%s\n",
						displayRPS(userNumber), displayRPS(comNumber));
				//승부판단
				switch(userNumber - comNumber) {
				case 0:
					System.out.println("비겼습니다");break;
				case 1: case -2:
					System.out.println("이겼습니다");break;
				case -1: case 2:
					System.out.println("졌습니다");break;
				}
			}
			
						
			//사용자가 0을 입력하면 게임종료
			if(userNumber==0) {
				System.out.println("게임을 종료합니다.");
				break;
			}			
		}			
	}
	public static String displayRPS(int n) {
		String str = "";
		switch(n) {
		case 1:
			str = "가위";break;
		case 2:
			str = "바위";break;
		case 3:
			str = "보";break;
		}
		return str;
	}
	public static void main(String[] args) {
		//가위바위보 게임 호출
		rpsGame();
	}
}











