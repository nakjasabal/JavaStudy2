package ex17collection;

import java.util.ArrayList;
import java.util.Scanner;

//문자열 일부 검색

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add("워너원");
		list.add("오마이걸"); 
		list.add("방탄소년단");
		
		System.out.print("검색항목:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		for(String obj : list) {
			if(obj.indexOf(str) != -1) {
				System.out.println("찾은항목="+ obj);
			}
		}
		
		int index = list.indexOf(str);
		System.out.println(str+"의index="+ index); 
	
		boolean bl = list.contains(str);
		System.out.println("존재유무="+ bl);
	}
}










