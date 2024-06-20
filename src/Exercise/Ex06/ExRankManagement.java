package Exercise.Ex06;

import java.util.Random;

public class ExRankManagement {

	public static void writeScore(int[][] arr) {
		
		Random rnd = new Random();
		rnd.setSeed(System.currentTimeMillis());
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				if(i==4 || j==4) {
					//총점에 관련된 항은 0으로 초기화
					arr[i][j] = 0;
				}
				else {
					//0~100점까지 난수생성
					arr[i][j] = rnd.nextInt(101);
				}
			}
		}
	}
	
	//점수의 총점을 구하는 메소드
	public static void calcuScore(int[][] arr) {
		
		int sumWidth = 0;//가로의합
		int sumHeight = 0;//세로의합
		int totalSum = 0;//전체의합
		
		//가로의합
		for(int i=0 ; i<arr.length-1 ; i++) {			
			for(int j=0 ; j<arr[i].length-1 ; j++) {
				sumWidth += arr[i][j];
			}			
			arr[i][4] = sumWidth;
			totalSum += sumWidth;
			sumWidth = 0;
		}
		//세로의합
		for(int i=0 ; i<arr.length-1 ; i++) {			
			for(int j=0 ; j<arr[i].length ; j++) {
				sumHeight += arr[j][i];				
			}
			arr[4][i] = sumHeight;
			sumHeight = 0;
		}
		
		arr[4][4] = totalSum;		
	}
	
	public static void printScore(int[][] arr) {
	
		String[] strArr = {"국어","영어","수학","국사","총점"};
		
		// \t : 서식문자로 Tab(탭)을 표현한다.
		System.out.println("구분\t철수\t영희\t민호\t아현\t총점\n");
		
		for(int i=0 ; i<arr.length ; i++) {
			
			//하나의 과목을 출력한다.
			System.out.printf("%s\t", strArr[i]);
			for(int j=0 ; j<arr[i].length ; j++) {
				//과목에 해당하는 점수가 출력된다.
				System.out.printf("%3d\t", arr[i][j]);
			}
			//한과목의 출력을 완료하면 줄바꿈처리한다.
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] scoreArr = new int[5][5];

		//점수 초기화하기
		writeScore(scoreArr);
		
		//점수 계산하기
		calcuScore(scoreArr);
		
		//전체점수 출력하기
		printScore(scoreArr);
	}

}
