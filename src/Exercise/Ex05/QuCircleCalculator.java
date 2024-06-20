package Exercise.Ex05;

public class QuCircleCalculator {
	
	/*
	클래스(전역) 상수의 경우 선언과 동시에 초기화 해야 한다.
	메소드내에 정의되는 지역 상수의 경우는 선언과 초기화를 따로 해도
	무방하다. 
	 */
	static final double PI = 3.1415;
	
	//원의둘레를 구하는 메소드
	public static double circleRound(double rad) {
		double result = 2 * PI * rad;
		return result;
	}
	
	//원의넓이를 구하는 메소드
	public static double circleArea(double rad) {
		double result = PI * rad * rad;
		return result;
	}	
	
	public static void main(String[] args) {
		
		 System.out.println("원의둘레:"+ circleRound(5.5));
		 double cirArea = circleArea(5.5);
		 System.out.println("원의넓이:"+ cirArea);		 
	}

}








