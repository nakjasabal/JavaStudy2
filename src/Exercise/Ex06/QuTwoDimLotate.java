package Exercise.Ex06;

public class QuTwoDimLotate {

	public static void main(String[] args) {
		
		/*int[][] arr = {
				{1,2,3},.args...args..
		}*/
		
		int initVal = 1;//배열의 초기값을 채우기위한 변수
		
		//3by3 배열 생성
		int[][] arr = new int[3][3];
		//배열 초기화
		/*
		2차원배열에서
			배열의이름.length => 세로길이 반환
			배열의이름[세로인덱스].length => 해당행의 길이 반환
		 */
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = initVal++;
			}
		}	
		
		//초기화후 배열출력
		System.out.println("초기화후 출력");
		showArray(arr);	
		
		//배열 shift 처리 메소드 호출
		System.out.println("shift 1차후 출력");
		rotateArray(arr);
		showArray(arr);
		
		System.out.println("shift 2차후 출력");
		rotateArray(arr);
		showArray(arr);	
	}
	
	//배열 shift처리 메소드
	public static void rotateArray(int[][] arrParam) {
		
		/*
		절차
			1. 배열의 마지막 행(3번째)을 변수에 저장한다.
			2. 배열의 두번째행을 세번째로, 첫번째행을 두번째로 옮긴다.
			3. 1에서 저장했던 마지막행을 첫번째행으로 옮긴다.
			
			※2차원배열에서 배열이름[인덱스] 가 하나의 행을 가르킨다는
			것을 이용한다.
		 */
		int[] lastRow = arrParam[arrParam.length-1];
		
		for(int row=arrParam.length-1 ; row>0 ; row--) {
			arrParam[row] = arrParam[row-1];
		}
		
		arrParam[0] = lastRow;	
	}	
	
	//배열출력용 함수
	public static void showArray(int[][] arrParam) {
		
		for(int i=0 ; i<arrParam.length ; i++) {
			for(int j=0 ; j<arrParam[i].length ; j++) {
				System.out.print(arrParam[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
