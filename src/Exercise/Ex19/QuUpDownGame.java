package Exercise.Ex19;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//예외처리클래스
class OutOfRange100Exception extends Exception
{
	//생성자
	public OutOfRange100Exception() {
		super("[예외발생]1~100 범위를 넘은 숫자가 입력되었음");
	}
}

public class QuUpDownGame {
	
	//사용자에게 주어진 기회 7번
	static final int GAME_COUNT = 7;
	
	//키보드를 통한 입력을 위한 인스턴스 생성
	static Scanner scan = new Scanner(System.in);
	
	//난수 생성을 위한 인스턴스 생성
	static Random rand = new Random();
		
	public static void main(String[] args) {
		
		rand.setSeed(System.currentTimeMillis());
		
		while(true) {
			
			try {
			
				//컴퓨터가 생각한 난수생성
				int com = rand.nextInt(1000) % 100 + 1;
				System.out.println("생성된난수:"+ com);
				
				//승부판단을 위한 변수
				boolean isVictory = false;
				
				//한 게임당 7번의 기회가 주어지므로...
				for(int chance=1 ; chance<=GAME_COUNT ; chance++) {
					
					//사용자로부터 정수 하나를 입력받는다.
					System.out.print("1~100사이의 정수를 입력하세요:");
					int user = scan.nextInt();
					
					//사용자 정의 예외처리
					if(user<1 || user>100) {
						/*
						Java에서 정의한 예외클래스가 아니기 때문에
						개발자가 반드시 예외를 발생시켜 throw 해줘야한다.
						 */
						OutOfRange100Exception oex = 
								new OutOfRange100Exception();
						throw oex;
					}
					
					//난수와 사용자입력값을 비교하여 up/down 표시
					if(com>user) {//사용자가 입력한 수가 작다면..
						System.out.println("Up입니다.");
					}
					else if(com<user) {//사용자가 입력한 수가 크다면..
						System.out.println("Down입니다.");
					}
					else {//정답이면...
						System.out.println("정답입니다.");
						//정답을 맞추면 승부판단변수를 true 대입
						isVictory = true;
						//주어진 기회안에 정답을 맞추면 for loop 탈출
						break;
					}		
				}
				
				if(isVictory==false) {
					System.out.println(GAME_COUNT+"번의 기회를 모두 소진하였습니다");
					System.out.println("패배하였습니다.");
				}
				else {
					System.out.println("승리하셨습니다.");
				}		
				
				//게임을 계속 진행할지 여부를 물어본다.
				System.out.println("게임을 다시 시작할까요?");
				System.out.println("1.게임재시작, 0:게임종료");
				int restart = scan.nextInt();
				if(restart==0) {
					System.out.println("감사합니다. 프로그램을 종료합니다.");
					//프로그램을 종료한다.
					System.exit(0);
				}
			}
			catch(OutOfRange100Exception e) {
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e) {
				/*
				버퍼에 남은 엔터키를 읽어서 제거하기
				 */
				scan.nextLine();
				System.out.println(e.getMessage());
			}			
		}////////while문의 끝	
	}///////main의 끝
}/////////class의 끝







