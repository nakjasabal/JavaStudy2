package Exercise.Ex05;

import java.util.Scanner;

public class QuTemperature {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("섭씨온도를 입력하세요:");
		double userCel = scan.nextDouble();//섭씨 20도
		System.out.print("화씨온도를 입력하세요:");
		double userFah = scan.nextDouble();//화씨 120도
		
		System.out.println("섭씨"+userCel+"를 화씨로 변환:"+
				celToFah(userCel));
		System.out.println("화씨"+userFah+"를 섭씨로 변환:"+
				fahToCel(userFah));

	}
	/*
	 	화씨 = 1.8 * 섭씨 + 32	 
		섭씨 = (화씨 - 32) / 1.8
	*/
	//섭씨를 화씨로 변환하는 메소드
	public static double celToFah(double cel) {
		double result = 1.8 * cel + 32;
		return result;
	}
	
	//화씨를 섭씨로 변환하는 메소드
	public static double fahToCel(double fah) {
		double result = (fah - 32) / 1.8;
		return result;
	}

}












