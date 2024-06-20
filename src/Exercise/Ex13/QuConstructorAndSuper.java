package Exercise.Ex13;

class Car
{
	private int gasoline;
	
	public Car(int g) {
		//gasoline 초기화
		gasoline = g;
		System.out.println("Car생성자호출");
	}
	//getter/setter메소드:private멤버를 설정or반환할 목적으로 생성
	public int getGasoline() {
		return gasoline;
	}
	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}	
}
class HybridCar extends Car
{
	private int electric;	
	public HybridCar(int g, int e) {
		//부모클래스의 생성자 호출 - 가솔린
		super(g);
		//electric은 초기화
		electric = e;
		System.out.println("HybridCar생성자호출");
	}
	public int getElectric() {
		return electric;
	}
	public void setElectric(int electric) {
		this.electric = electric;
	}   
}
class HybridWaterCar extends HybridCar
{
	int water;
	//생성자	
	public HybridWaterCar(int g, int e, int w) {
		//부모클래스의 생성자 호출 - 가솔린, 전기
		super(g, e);
		//water는 초기화
		water = w;
		System.out.println("HybridWaterCar생성자호출");
	}
	public void showNowGauge()
	{
		System.out.println("남은가솔린:"+getGasoline());
		System.out.println("남은전기량:"+getElectric());
		System.out.println("남은워터량:"+water);
	}
}
public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		//HybridWaterCar 클래스의 매개변수 3개인 생성자 호출
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}

}








