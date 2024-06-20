package Exercise.Ex08;

class JBank{
	
	//멤버변수 : 이율(static으로 설정), 금액, 이름
	private static double interRate;
	static {
		interRate = 0.0f;
	}
	private int money;
	private String name;
	
	//생성자
	public JBank(){ //기본생성자
		money = 0;
		name = "손님";
	}
	public JBank(int money, String name){ //인자생성자
		this.money = money;
		this.name = name;
	}
	
	
	//멤버메소드
	//입금처리
	public boolean depositMoney(int money) {
		this.money += money;
		return true;
	}
	
	//출금처리 
	public boolean withdrawalMoney(int money) {
		this.money -= money;
		return true;
	}
	
	//현재상태(이름, 이율, 잔액)출력하기
	public void showJBank() {
		System.out.printf("%s님의 잔금:%d원\n", name, money);
		System.out.printf("현재이율:%.2f\n", JBank.interRate);
	}
	
	/*
	이율변경하기 : interRate가 static타입이므로 
		메소드도 static 타입으로 선언하는것이 좋다.
		그리고 정적변수의 접근은 "클래스명.변수명" 형태를 사용하도록 한다.		
	 */
	public static boolean setInterRate(double iRate) {		
		JBank.interRate = iRate;
		System.out.println("이율이 "+iRate+"로 변경되었습니다.");
		return false;
	}
	public static double getInterRate() {
		//정적변수를 반환하는 getter 메소드
		return JBank.interRate;
	}
}


public class QuJbankMain {

	public static void main(String[] args) {
				
		//-은행 이율 설정 : 0.02
		JBank.setInterRate(0.02);
		
		//-홍길동, 12500원으로 통장 개설
		JBank gildong = new JBank(12500, "홍길동");
		gildong.showJBank();
		
		//-이순신, 59450원으로 통장 개설
		JBank soonsin = new JBank(59450, "이순신");
		soonsin.showJBank();
		
		//-홍길동, 4650원 인출
		gildong.withdrawalMoney(4650);
		gildong.showJBank();
		
		//-이율변경 0.02 -> 0.035
		JBank.setInterRate(0.035);

	}

}






