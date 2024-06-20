package Exercise.Ex04;
/*
문제3)다음 예제는 두개의 if문을 사용하고 있다.
이를 하나의 if문으로 변경해보자
파일명 : QuIfMerge.java
 */
public class QuIfMerge {

	public static void main(String[] args) {
		
		int num = 120;
		/*
		if (num > 0) {
        	if ((num % 2) == 0) {
               	System.out.println("양수이면서 짝수");
        	}
 		}
 		위 if문을 아래로 변경함...
		 */
        if (num > 0 && (num % 2) == 0) {
				System.out.println("양수이면서 짝수");
			
        }

	}

}
