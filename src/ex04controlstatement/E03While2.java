package ex04controlstatement;
 
public class E03While2 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			System.out.println("변수i="+ i);
			i++;
		}
		
		/*
		시나리오] 1~10까지의 합을 구하는 프로그램을 while문으로 작성하시오.		
		 */
int sum = 0;
int j = 1;
while(j<=10) {
	sum += j;  
	j++;
}
System.out.println("1~10까지의합sum="+ sum);

		
		
		/*
		시나리오] 1~100까지의 정수중 3의배수이거나 4의배수인 
		정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
		 */
int total = 0;
int k = 1;
while(k<=100) {
	if(k%3==0 || k%4==0) {
		total += k;
		System.out.println("k="+ k);
	}
	k++;
}
System.out.println("3또는4의배수의합:"+ total);
		
		
		
		
		/*
		시나리오] 구구단을 출력하는 프로그램을 while문으로 작성하시오.
		 */
		int dan = 2; 
		while(dan<=9) { 
			int su = 1; 
			while(su<=9) {
				System.out.printf("%d*%d=%2d", dan, su, (dan*su));
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n============================\n");
		
		
			
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		//행으로 4번 반복하기 위한 변수 
int x=1;
while(x<=4) {
	int y=1;  
	while(y<=4) {
		if(x==y) { 
			System.out.print("1 ");
		}				
		else {
			System.out.print("0 ");
		}
		y++;
	}
	System.out.println(); 
	x++;
}	
		
		System.out.println();

		
		
		/*
		연습문제] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
		*/
		//행에 대한 반복
		int a = 1;
		while(a<=4) {
			//(행이 고정된 상태에서) 열에 대한 반복
			int b = 1;
			while(b<=4) {
				//슬러쉬 방향으로 출력시에는 더해서 5가 될때
				if(a+b==5)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				b++;
			}
			a++;
			System.out.println();
		}
	}
}



