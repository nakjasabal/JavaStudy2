package Exercise.Ex06;
/*
야구게임(Baseball Game)
파일명 : ExBaseballGame.java
중복되지 않는 3개의 정수를 생성한다.(1~9)
사용자는 3개의 숫자를 입력한다. 입력시에는 스페이스나 엔터로 구분한다.
생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
3 strike 가 되면 게임은 종료된다.
시도한 횟수를 표시한다.
계속할지 종료할지 여부를 물어보고 다음 진행을 한다.
*/

import java.util.Random;
import java.util.Scanner;

public class ExBaseballGame {
	
	static Scanner scan = new Scanner(System.in);
	static Random random = new Random();

	//배열을 통한 야구게임 구현
	public static void baseBallArray() {
		//컴퓨터가 생각한 3개의 정수
		int[] com = new int[3];
		//사용자가 입력할 3개의 정수
		int[] user = new int[3];
		//스트라이크, 볼 판정을 위한 변수
		int strikeCnt=0, ballCnt=0;
		//몇번의 입력으로 게임이 종료되었는지 판단할 변수
		int gameCount=0;
		

		
		
		
		
	}//////baseBallArray()의 끝
	
	//기본자료형 변수를 통한 야구게임 구현
	public static void baseBallVar() {
		//컴퓨터가 생각한 3개의 정수
		int com1, com2, com3;
		//사용자가 입력할 3개의 정수
		int user1, user2, user3;
		//스트라이크, 볼 판정을 위한 변수
		int strikeCnt=0, ballCnt=0;
		//몇번의 입력으로 게임이 종료되었는지 판단할 변수
		int gameCount=0;
		
		while(true) {
			//컴퓨터가 생각한 3개의 난수를 생성...
			while(true) {
				com1 = random.nextInt(10) % 9 + 1;
				com2 = random.nextInt(9) + 1;
				com3 = random.nextInt(9) + 1;
				
				//아래 if문은 동일한 조건임
				//if( (com1!=com2) && (com2!=com3) && (com3!=com1) ) {
				if( !(com1==com2 || com2==com3 || com3==com1)   ) {
					//중복된 난수가 발견되지 않는다면 루프를 탈출한다.
					break;
				}
			}/////while문끝(난수생성부분)
			
			//중복되지 않는 난수가 생성되는지 확인
			System.out.println(com1+" "+com2+" "+com3);
			
			while(true) {
				//사용자로부터 3개의 정수 입력받기
				System.out.println("3개의정수를 입력하세요(1~9)");
				System.out.println("숫자는 스페이스로 구분하시고 마지막에 "
						+ "Enter를 입력해주세요");
				user1 = scan.nextInt();
				user2 = scan.nextInt();
				user3 = scan.nextInt();
				
				//사용자가 입력할때마다 하나씩 증가하기
				gameCount++;
				
				//스트라이크 판단(위치까지 일치해야 함)
				if(com1==user1) strikeCnt++;
				if(com2==user2) strikeCnt++;
				if(com3==user3) strikeCnt++;
				
				//볼 판단(위치는 다르지만 3개의 숫자안에 포함되어 있다면 볼)
				if(com1==user2 || com1==user3) ballCnt++;
				if(com2==user1 || com2==user3) ballCnt++;
				if(com3==user1 || com3==user2) ballCnt++;
				
				//3스트라이크이면 게임종료
				if(strikeCnt==3) {
					System.out.println("3스트라이크 게임종료");
					System.out.println(gameCount+"번만에 맞추셨습니다.");
					break;
				}
				else {
					//하나도 못맞추는 경우 : out처리
					if(ballCnt==0 && strikeCnt==0) {
						System.out.println("Out입니다");
					}
					else {
						System.out.printf("%d스트라이크,%d볼\n",
								strikeCnt, ballCnt);
					}
				}
				
				//한번의 입력이 끝난후 변수를 초기화 해야함
				strikeCnt=0;
				ballCnt=0;			
			}////while문의 끝(게임진행)
			
			
			//1번의 게임이 완전히 종료된후 재시작 or 종료 물어보기
			System.out.println("한게임 더 하시겠습니까?");
			int restart = scan.nextInt();
			if(restart==0) {
				//종료하는경우 전체 while문 탈출
				break;
			}
			else {
				//게임을 재시작하는경우 판단변수 초기화후 while루프의 처음으로
				strikeCnt=0;
				ballCnt=0;
				gameCount=0;
			}
			
		}////while문의 끝(전체게임)
		
	}/////baseBallVar()의 끝
	
	public static void main(String[] args) {
		
		//시드 설정		
		random.setSeed(System.currentTimeMillis());
		
		//메소드 호출
		//baseBallVar();
		baseBallArray();
		
	}/////main()의 끝

}/////클래스의 끝








