package Exercise.Ex08;

class ChildProperty{
	
	//멤버변수
	int beadCnt; //어린이가 보유한 구슬의 갯수
	
	//생성자메소드
	ChildProperty(int _beadCnt){
		beadCnt = _beadCnt;
		/*
		매개변수와 멤버변수의 이름이 같다면...
		this.beadCnt = beadCnt;
		 */
	}
	
	//멤버메소드
	
	//어린이의 현재상태를 보여줌
	void showProperty(){
		System.out.println("구슬의갯수:"+ beadCnt);
	}
	
	//실제 게임을 진행하는 메소드
	void obtainBead(ChildProperty child, int bNum) {
		
		/*
		게임에서 패배한 어린이의 구슬의 갯수와 bNum을 비교함.
		만약 보유한 구슬의 갯수보다 bNum이 많다면 마이너스로 처리하는것이
		아니라 0으로(모든 구슬을 잃는 상황) 처리하는것이 타당함
		*/
		if(child.beadCnt < bNum) {
			//어린이2가 보유한 만큼만 어린이1이 획득
			beadCnt += child.beadCnt;
			//어린이2는 보유한 구슬 없음
			child.beadCnt = 0;
		}
		else {
			//보유한 갯수보다 손실 갯수가 적은경우
			child.beadCnt -= bNum;
			beadCnt += bNum;
		}		
		System.out.println("=한번의 구슬게임이 종료됨=");
	}
}

public class QuMarbles {

	public static void main(String[] args)
	{        	
		ChildProperty child1 = new ChildProperty(10);		
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 게수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/	
		child1.obtainBead(child2, 5);		

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);
		
		/*
		3차게임 : 어린이1이 50개를 획득하는 과정을 표현해보자
			이 경우 전체 구슬의 갯수가 25개 밖에 안되므로 그 범위내에서
			게임이 진행되도록 하는것이 현실적으로 논리적임.
		*/
		child1.obtainBead(child2, 50);
		
		

		System.out.println("\n게임 후 구슬의 보유 게수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
	}


}
