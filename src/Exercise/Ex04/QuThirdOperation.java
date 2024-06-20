package Exercise.Ex04;
/*
문제4) 아래 코드를 삼항연산자를 사용하지 말고 if~else문으로
변경해보자.
파일명 : QuThirdOperation.java
 */
public class QuThirdOperation {

	public static void main(String[] args) {
     	
		int num1=50, num2=100;
     	int big, diff;
     	/*
     	big = (num1>num2)? num1:num2; 
     	위 삼항연산자를 아래 if문으로 변경
     	 */
     	if(num1>num2) {
     		big = num1;
     	}
     	else {
     		big = num2;
     	}
     	System.out.println(big);
     	
     	/*
     	diff = (num1>num2)? num1-num2: num2-num1;
		해당 문장을 if문으로 변경
     	 */
     	if(num1>num2) {
     		diff = num1-num2;
     	}
     	else { 
 			diff = num2-num1;
 		}
     	System.out.println(diff); 

	}

}
