package Exercise.Ex18;

class Point extends Object
{
	int xPos;
	int yPos;
	public Point(int x, int y){
		xPos=x;
		yPos=y;
	}
	public void showPosition(){
		System.out.printf("[%d, %d]", xPos, yPos);
	}
	
	//Point클래스의 equals메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		
		Point comparePoint = (Point)obj;
		if(xPos==comparePoint.xPos && yPos==comparePoint.yPos) {
			//두개의 값의 모두 같다면 true반환
			return true;
		}
		else {
			//다르면 false반환
			return false;
		}
	}
}
class Rectangle extends Object
{
	Point upperLeft, lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2){
		upperLeft=new Point(x1, y1);
		lowerRight=new Point(x2, y2);
	}
	public void showPosition(){
		System.out.println("직사각형 위치정보...");
		System.out.print("좌 상단: ");
		upperLeft.showPosition();
		System.out.println();	
		System.out.print("우 하단: ");
		lowerRight.showPosition();	
		System.out.println("\n");
	}
	
	//Rectangle 클래스의 equals메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		Rectangle compareRec = (Rectangle)obj;
		if(upperLeft.equals(compareRec.upperLeft) &&  
				lowerRight.equals(compareRec.lowerRight)) {
			return true;
		}
		else {
			return false;
		}
	}
}

class QuRecEqualsMain
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(1, 3, 5, 7);
		Rectangle r2 = new Rectangle(2, 3, 5, 5);
		Rectangle r3 = new Rectangle(1, 3, 5, 7);
			
		r1.showPosition();
		r2.showPosition();
		r3.showPosition();
			
		if(r1.equals(r2))
			System.out.println("r1과 r2의 위치 정보는 같다.");
		else
			System.out.println("r1과 r2의 위치 정보는 다르다.");
			
		if(r1.equals(r3))
			System.out.println("r1과 r3의 위치 정보는 같다.");
		else
			System.out.println("r1과 r3의 위치 정보는 다르다.");
		
	}
}
