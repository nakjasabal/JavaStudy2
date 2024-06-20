package Exercise.Ex10;

class Rectangle
{
	//멤버변수
   	private int ulx, uly;//좌상단
   	private int lrx, lry;//우하단
   	//좌표값이 정상인지 여부를 표현하는 멤버변수
   	private boolean isFlag = true;
   	
   	//생성자
   	public Rectangle(int ulx, int uly, int lrx, int lry) {

   		//좌표값이 정상범위안에 있는지 판단
   		if(isRange(ulx)==false || isRange(uly)==false) {
   			System.out.println("좌상단 좌표 범위가 잘못되었습니다."); 
   			isFlag = false;
   		}
   		if(isRange(lrx)==false || isRange(lry)==false) {
   			System.out.println("우하단 좌표 범위가 잘못되었습니다.");
   			isFlag = false;
   		}
   		if(ulx>=lrx || uly>=lry) {
   			System.out.println("좌측 우측 좌표지정이 잘못되었습니다.");
   			isFlag = false;
   		}
   		
   		this.ulx = ulx;
   		this.uly = uly;
   		this.lrx = lrx;
   		this.lry = lry;
   	}
   	
   	//좌표값이 0~100 사이인지 판단하는 메소드
   	public boolean isRange(int point) {
   		if(point<0 || point>100) {
   			return false;
   		}
   		else {
   			return true;
   		}
   	}
   	
   	//사각형의 넓이를 구한 메소드
   	public void showArea()
   	{
   		//사각형 객체 생성시 좌표값에 오류가 있다면 isFlag는 false가 됨.
   		if(isFlag==false) {
   			System.out.println("좌표값 오류로 넓이를 계산할수 없습니다.");
   			return;
   		}
   		//좌표값에 문제가 없어 정상적으로 객체가 생성된 경우만 넓이계산
     	int xLen = lrx - ulx;
     	int yLen = lry - uly;
     	System.out.println("넓이:"+(xLen*yLen));
   	}  	
}


class QuRectangle
{
   	public static void main(String[] args)
   	{
     	/*Rectangle rec = new Rectangle();
     	rec.ulx=22;
     	rec.uly=22;
     	rec.lrx=10;
     	rec.lry=10;*/

		Rectangle rec1 = new Rectangle(1,1,10,10);
		rec1.showArea();
		
		Rectangle rec2 = new Rectangle(-2,-2,101,101);
		rec2.showArea();
		
		Rectangle rec3 = new Rectangle(10,10,1,1);
		rec3.showArea();
     	
   	}
}

