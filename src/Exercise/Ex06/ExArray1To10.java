package Exercise.Ex06;

/*
문제]다음 절차에 따라 프로그램을 작성하시오.
1. 크기가 10인 정수타입의 배열을 선언한다.
2. 반복문을 이용하여 배열을 채운다. 
이때 배열은 1,2,3,4....순서대로 채운다.
3. 2번에서 채운 배열을 출력한다.
4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
5. 누적해서 더한 값을 출력한다. 
 */
public class ExArray1To10 {

	public static void main(String[] args) {
		
		//1. 크기가 10인 정수타입의 배열을 선언한다.
		int[] arr = new int[10];
		
		/*
		2. 반복문을 이용하여 배열을 채운다. 
		이때 배열은 1,2,3,4....순서대로 채운다.
		arr[0] = 1;
		arr[1] = 2;
		........
		arr[9] = 10;
		 */		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
			
			//arr[i] = i++;
			/*[잘못된표현] i값 자체가 증가하기때문에 두번증가
			하는 꼴이 된다.*/
		}
		
		//3. 2번에서 채운 배열을 출력한다.
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		/*
		4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
		 */
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
			//sum = sum + arr[i]; 위와 같은 표현임
		}
		
		/*
		5.누적된 값을 출력한다.
		 */
		System.out.println("배열전체요소의 누적합:"+ sum);
		
	}//end of main

}//end of class








