package Exercise.Ex10;
//점(좌표)을 표현하는 클래스
class Point
{
	//멤버변수 : x, y값으로 좌표 하나를 표현함.
   	int xDot, yDot;
   	//생성자메소드
   	public Point(int x, int y)
   	{
 		xDot=x;
 		yDot=y;
   	}
   	//멤버메소드 : 멤버변수 출력
   	public void showPointInfo()
   	{
   		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	
	//생성자 : 중심점과 반지름을 초기화하기 위해 3개의 매개변수가 필요
	public Circle(int x, int y, int rad) {
		radian = rad;
		center = new Point(x,y);
	}
		
	//멤버메소드 : 원의 정보를 출력하는 메소드
	public void showCircleInfo() {
		//반지름 출력
		System.out.println("반지름:"+radian);
		//중심점 출력
		center.showPointInfo();
	}	
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	
	//생성자
	public Ring(int inX, int inY, int inR, int outX, int outY, int outR) {
		innerCircle = new Circle(inX, inY, inR);
		outerCircle = new Circle(outX, outY, outR);
	}
	
	//멤버메소드
	public void showRingInfo() {
		System.out.println("안쪽원의 정보는:");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의 정보는:");
		outerCircle.showCircleInfo();
	}
}

public class QuRingMake {
	
	public static void main(String[] args) {
		
	   	Ring c = new Ring(1,1,3,2,2,9);
	   	c.showRingInfo();
	   	
	}
}

