package Exercise.Ex06;

import java.util.Scanner;

/*
문제6-10) 홀수/짝수 구분하여 배열채우기
파일명 : ExFillArray.java
길이가 10인 배열을 선언한후 
총 10개의 정수를 입력받아 순서대로 저장한다.(첫번째배열)
그리고 순서대로 저장된 숫자들을
홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 
채워나간다.(두번째배열)

출력예시) 총 10개의 정수를 입력하시오.
1 2 3 4 5 6 7 8 9 10

순서대로입력된결과: 1 2 3 4 5 6 7 8 9 10
홀수/짝수 구분입력결과 : 1 3 5 7 9 10 8 6 4 2
 */
public class ExFillArray {

	public static void main(String[] args) {
		 
		//길이가 10인 배열을 선언
		int[] arr = new int[10];//짝수 홀수 구분해서 저장하는 용도
		int[] arr2 = new int[10];//입력된 순서대로 저장하는 용도
		
		//배열의 인덱스를 저장할 변수 생성
		int indexStart = 0;//처음부터 시작하는 인덱스
		int indexEnd = arr.length - 1;//끝에서부터 시작하는 인덱스
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요.");
		
		//정수10개를 입력받는다.
		for(int i=0 ; i<arr.length ; i++) {
			
			//사용자로부터 정수를 입력받음
			int inputNum = scan.nextInt();
			
			//입력된 순서대로 배열 채우기
			arr2[i] = inputNum;
			
			//홀수 or 짝수 판단
			if(inputNum%2 != 0) {//홀수일때
				//앞에서부터 채우기
				arr[indexStart] = inputNum;
				indexStart++;//앞에서 채우면 그다음 인덱스로 증가함
			}
			else {//짝수일때
				//뒤에서부터 채우기
				arr[indexEnd] = inputNum;
				indexEnd--;//뒤에서 채우면 이전 인덱스로 감소함
			}			
		}//end of for문(10번반복)
		
		
		//배열출력하기
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.print(arr2[i] +" ");
		}
		System.out.println();
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] +" ");
		}	
		
	}//end of main

}//end of class












