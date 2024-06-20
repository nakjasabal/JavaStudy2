package Exercise.Ex14;


class Box{
	public void boxWrap() {
		System.out.println("Box로 포장합니다.");
	}
	public void callWrap() {
		boxWrap();
	}
}
class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("PaperBox로 포장합니다.");
	}
	@Override
	public void callWrap() {
		paperWrap();
	}
}
class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("GoldPaperBox로 포장합니다.");
	}
	@Override
	public void callWrap() {
		goldWrap();
	}
}

public class QuInstanceofToOverride {

	public static void wrapBox(Box b) {

		b.callWrap();
	}
	
	public static void main(String[] args) {
		
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
			
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
		
		/*
		이경우 참조(인스턴스)변수는 Box타입이지만 
		GoldPaperBox 클래스를 참조하고 있으므로 
		오버라이딩 처리된 가장 하위 클래스의 메소드가 
		호출되게 된다.
		※오버라이딩 되었을때는 동질화이든, 이질화이든
		무조건 최하위 클래스의 메소드가 호출된다.
		 */
		Box box4 = new GoldPaperBox();
		wrapBox(box4);
		
	}
}






