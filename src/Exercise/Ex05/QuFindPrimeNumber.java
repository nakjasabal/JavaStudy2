package Exercise.Ex05;

public class QuFindPrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("1에서 100사이의 소수를 출력:");
		
		int start = 1;
		do {
			//소수인지 여부를 판단하는 메소드 호출
			boolean isPrime = isPrimeNumber(start);
			if(isPrime==true) {
				//소수로 판단된 자연수에 한해서 출력함.
				System.out.println(start);
			}
			
			start++;
		}
		while(start<=100);
	}
	public static boolean isPrimeNumber(int num) {
		
		//1은 소수가 아니므로 무조건 false를 반환함
		if(num==1) {
			return false;
		}
		else {
			/*
			모든 자연수는 1과 자기자신으로 나눠서 떨어지므로 
			1과 자기자신을 제외한 나머지 자연수중에서
			나눠서 떨어지는 수를 찾게되면 그 수는 '소수'가 아니다.
			 */
			for(int i=2 ; i<num ; i++) {
				if(num%i == 0) {
					return false;
				}
			}			
		}
		//나눠서 떨어지는 수가 없었다면...
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}




