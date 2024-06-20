package Exercise.Ex08;

class CalculatorEx{
	
	//멤버변수 : 각 연산의 횟수를 카운트
	int addCount;
	int minCount;
	int mulCount;
	int divCount;
	
	/*
	생성자메소드 : 
		1.클래스명과 이름이 동일하고 반환타입이 없는 메소드
		2.객체가 생성될때 딱 한번만 호출되는 메소드
		3.개발자가 임의로 호출할 수 없음
		4.딱 한번만 호출되므로 멤버상수를 초기화 할수 있다.
		5.나머지는 일반 메소드와 같은 특성을 가진다.(오버로딩 등)
	 */
	CalculatorEx(){
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}
	
	//횟수 카운트용 멤버변수를 0으로 초기화
	/*void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}*/
	
	//각 연산을 담당하는 메소드내에서 횟수카운트 증가
	int add(int n1, int n2) {
		addCount++;
		return n1 + n2;
	}
	double min(double n1, double n2) {
		minCount++;
		return n1 - n2;
	}
	double mul(double n1, double n2) {
		mulCount++;
		return n1 * n2;
	}
	double div(double n1, double n2) {
		divCount++;
		return n1 / n2;
	}
	//연산의 횟수를 디스플레이 하는 메소드
	void showOpCount() {
		System.out.println("덧셈횟수:"+addCount);
		System.out.println("뺄셈횟수:"+minCount);
		System.out.println("곱셈횟수:"+mulCount);
		System.out.println("나눗셈횟수:"+divCount);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		//cal.init(); -> 생성자 메소드로 초기화를 대체함
		
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100.0 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
}
