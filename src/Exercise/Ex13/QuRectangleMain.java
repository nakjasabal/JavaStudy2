package Exercise.Ex13;

//직사각형을 표현한 클래스
class Rectangle
{
	//멤버변수
	int width;
	int height;
	
	//생성자
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	//멤버메소드
	public void ShowAreaInfo() {
		if(width==height) {
			System.out.println("정사각형면적[P]:"+ (width*height));	
		}
		else {
			System.out.println("직사각형면적:"+ (width*height));
		}		
	}
     	
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	//멤버변수
	// -> 상속받았으므로 필요없음..
	
	//생성자
	public Square(int width) {
		//정사각형은 가로,세로의 길이가 같으므로 아래와같이 호출
		super(width, width);
	}
	
	//멤버메소드
	@Override
	public void ShowAreaInfo() {
		System.out.println("정사각형면적[C]:"+ (width*height));	
	}
} 

public class QuRectangleMain {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
 
       	Square sqr = new Square(7);
       	sqr.ShowAreaInfo();

	}

}







