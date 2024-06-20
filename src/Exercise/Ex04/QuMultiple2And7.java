package Exercise.Ex04;
/*
문제6) 1000이하의 자연수 중에서 2의배수이면서 7의배수인
숫자를 출력하고 그 숫자들의 합을 구하여 출력해보자.
파일명 : QuMultiple2And7.java
 */
public class QuMultiple2And7 {

	public static void main(String[] args) {
		
		int countNum = 1;//1000번 반복을 위한 변수
		int sum = 0;//2 와 7의 배수의 누적합을 위한 변수
		
		while(countNum<=1000)
		{
			//2의배수 이면서 7의배수 출력하기
			if(countNum%2==0 && countNum%7==0)
			{
				System.out.printf("%d ", countNum);
				sum += countNum;//누적합계
			}
			countNum++;
		}
		
		System.out.println("\n누적합계는?"+ sum);

	}

}
