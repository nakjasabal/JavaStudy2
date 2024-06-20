package Exercise.Ex08;

/*
연습문제] 밑변과 높이를 저장할수 있는 삼각형 클래스를 정의해보자.
생성자를 통해 객체생성과 동시에 밑변과 높이가 초기화 되어야한다.
그리고 밑변의 길이와 높이의 길이를 각각 변경시킬수 있는 멤버메소드도
정의하자.
또한 삼각형의 넓이를 구해서 반환하는 메소드도 함께 정의해보자.
실행방법]
	주어진 메인함수를 따른다.
 */
class Triangle{

	//멤버변수
	int bottom;//밑변
	int height;//높이
	
	/*생성자메소드
	 		: 객체생성시 전달된 매개변수를 통해 인자가 2개인
	 		생성자 메소드가 호출되고, 객체가 생성됨과 동시에
	 		초기화도 이루어짐.
	 */
	public Triangle(int _bottom, int _height) {
		bottom = _bottom;
		height = _height;
	}
	
	//멤버메소드
	
	//삼각형의 넓이를 구하여 반환하는 메소드
	public double getArea() {
		//삼각형의넓이 : 밑변 * 높이 * 0.5;
		
		//double result = bottom * height * 0.5;
		//double result = bottom * height / 2.0;
		double result = bottom * height / 2d;/*숫자뒤에 접미사 d를 붙히면
					double 타입으로 인식함 */
		
		return result;
	}
	
	//밑변 길이 변경
	public void setBottom(int bot) {
		bottom = bot;
		System.out.println("밑변이 "+ bot +" 로 변경됨");
	}
	//높이 변경
	public void setHeight(int hei) {
		height = hei;
		System.out.println("높이가 "+ hei +" 로 변경됨");
	}
}

public class TriangleArea {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(10, 17);//밑변, 높이
		
		System.out.println("삼각형의넓이1 : "+ triangle.getArea());
		
		triangle.setBottom(50); // 밑변 길이 변경
		triangle.setHeight(14); // 높이 변경
		
		System.out.println("삼각형의넓이2 : "+ triangle.getArea());
		
	}

}
