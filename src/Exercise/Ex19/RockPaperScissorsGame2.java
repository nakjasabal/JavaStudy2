package Exercise.Ex19;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

/*
가위바위보 게임 구현하기

*/
class RockPaperScissorsGame2
{
	public static void rpsGameStart()
	{
		//난수생성을 위한 인스턴스 생성
		/*
		난수를 생성하기 위해 Random 클래스를 사용한다. 
		사용시 다른 패턴의 난수를 생성하기 위해서는 
		seed(씨앗)를 다르게 심어줘야 한다. 이를 위해
		1000분의 1초 단위로 현재시간을 반환하는 
		System.currentTimeMillis() 메소드를 사용한다.
		
		씨드가 동일한 경우 항상 같은 패턴의 난수가 생성되게
		되는데 이를 가짜난수(Pseudo Number)라 한다.
		*/
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		//사용자 입력을 받기 위한 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			try {
				/*
				nextInt(정수) : 매개변수로 주어진 정수 이하의 난수를
				생성함. 
				  nextInt(100) -> 0~99까지의 난수 생성
				*/
				int rndNumber = random.nextInt(100);		
				//System.out.println(System.currentTimeMillis());
				//System.out.println("생성된 난수는:"+rndNumber);
				
				int comNumber = rndNumber % 3 + 1;
				//System.out.println("컴퓨터가 생각한 숫자:"+comNumber);
				
				
				 
				System.out.println("가위바위보중 하나를 선택하세요.");
				System.out.print("1(가위),2(바위),3(보),0(종료):");
				
				
				int userNumber = 0;
				 
				userNumber = sc.nextInt();
				//	System.out.println("사용자가 낸 숫자:"+userNumber);
				
				if(userNumber==0) {
					break;//가장 가까운 반복문 하나를 빠져나간다.
				}
			 
								
				
				/*---승부 판단 부분*/
				if(comNumber==1&&userNumber==1){
					System.out.print("사용자:가위,컴퓨터:가위\n비겼습니다.\n");
				}
				if(comNumber==1&&userNumber==2){
					System.out.print("사용자:바위,컴퓨터:가위\n이겼습니다.\n");			
				}
				if(comNumber==1&&userNumber==3){
					System.out.print("사용자:보,컴퓨터:가위\n졌습니다.\n");			
				}
				
				
				if(comNumber==2&&userNumber==1){
					System.out.print("사용자:가위,컴퓨터:바위\n졌습니다.\n");
				}
				if(comNumber==2&&userNumber==2){
					System.out.print("사용자:바위,컴퓨터:바위\n비겼습니다.\n");			
				}
				if(comNumber==2&&userNumber==3){
					System.out.print("사용자:보,컴퓨터:바위\n이겼습니다.\n");			
				}
				
				
				if(comNumber==3&&userNumber==1){
					System.out.print("사용자:가위,컴퓨터:보\n이겼습니다.\n");
				}
				if(comNumber==3&&userNumber==2){
					System.out.print("사용자:바위,컴퓨터:보\n졌습니다.\n");			
				}
				if(comNumber==3&&userNumber==3){
					System.out.print("사용자:보,컴퓨터:보\n비겼습니다.\n");			
				}
				
				/*
				사용자가 1,2,3 이외에 다른 정수를 입력한다면...
				아래 2가지 조건은 같은 의미
				*/			
				if(!(userNumber==1 || userNumber==2 || userNumber==3))
				//if(userNumber!=1 && userNumber!=2 && userNumber!=3)
				{
					System.out.println("가위바위보 할줄 모르세요??\n"+
						"제대로 내세요..^^*\n");
				}
			}
			catch(InputMismatchException e) {
				
				/*
				버퍼에 남은 엔터키 지움. 버퍼는 별도로 삭제하는것이
				아니라 읽으면 자동으로 소멸됨.
				 */
				sc.nextLine();
				
				System.out.println("[예외발생]숫자만 입력하셔야 합니다.");
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
				
		System.out.println("게임이 종료되었습니다");		
	}
	
	public static void main(String[] args)
	{
		//가위바위보 게임 메소드 호출
		rpsGameStart();	
	}
}







