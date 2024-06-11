package quiz;

public class QuUpgradeGuGu {

	
	public static void gu01(String name) {		
		for (int dan = 2; dan <= 9; dan++) {

            for (int su = 1; su <= 9; su++) {

                int result = (int) Math.pow(dan, su);

                for (int i = 1; i <= su; i++) {

                    if (i == su) {

                        if (su == 1) {

                            System.out.print(dan + " X " + i + " = " + dan);

                        } else {

                            System.out.print(dan + " = " + result);

                        }

                    } else {

                        System.out.print(dan + " X ");

                    }

                }

                System.out.println();

            }

            System.out.println();

            System.out.println("====================================");

            System.out.println();
		}
	}
		
	public static void gu02(String name) {		
		 for (int i = 2; i <= 9; i++) {

	            System.out.print(i + "X" + "1" + "=");

	            System.out.println(i * 1);

	            int sum = i * 1;

	            for (int j = 2; j <= 9; j++) {

	                for (int q = 1; q <= j; q++){

	                    if (q != j) {

	                        System.out.print(i + "X");

	                    } else {

	                        System.out.print(i);

	                    }

	                }

	                System.out.print("=");

	                sum *= i;

	                System.out.print(sum);

	                System.out.println();

	            }



	        }
	}
	
	public static void gu03(String name) {

		// 결과를 저장할 변수

		int result;



		// 2단부터 9단까지 출력

		for (int i = 2; i <= 9; i++) {

			result = i;

			// 각 단마다 9줄 출력

			for (int j = 1; j <= 9; j++) {

				System.out.print(i);

				// 첫번째 출은 X 1 출력

				if (j == 1) {

					System.out.print(" X 1");

				}

				// 그 이후 줄은 줄 수 만큼 X 단 출력

				else {

					for (int k = 1; k < j; k++) {

						System.out.print(" X " + i);

					}

					result *= i;

				}

				// 각 줄마다 결과 출력

				System.out.println(" = " + result);

			}

		}


	}
	public static void gu04(String name) {
		int result;

		// 구구단 9단까지 출력을 위해 단을 10미만으로 설정
		for(int dan=2; dan<10; dan++) {
		for(int k=1; k<10; k++) {
		for(int i=1; i<=k; i++) {
		System.out.printf("%d ", dan);
		if(k == 1) {
		System.out.printf("X %d", k);
		}
		if(i == k) {
		// i만큼 dan을 거듭제곱하여 result에 대입
		result = (int)Math.pow(dan, i);
		System.out.printf("= %d", result);
		}
		else {
		System.out.print("X ");
		}
		}
		System.out.println();

		}
		System.out.println();
		}
		
	}
	
	
	public static void guguUp(int dan, int num) {

        int result = 1;

        if (num == 1) {

            System.out.print(dan + " X 1 = " + dan);

        } else {

            for (int i = 1; i <= num; i++) {

                System.out.print(dan);

                if (i < num) {

                    System.out.print(" X ");

                }

                result *= dan;

            }

            System.out.print(" = " + result);

        }

    }
	public static void gu05(String name) {
		for (int dan = 2; dan <= 9; dan++) {

            for (int num = 1; num <= 9; num++) {

                guguUp(dan, num);

                System.out.println();

            }

        }
	}
	public static void gu06(String name) {
		
	}
	public static void gu07(String name) {
		
	}
		
		
	public static void main(String[] args) {
		gu01("이형석");
		System.out.println("=구분선=======================================");		
		gu02("강민찬");
		System.out.println("=구분선=======================================");		
		gu03("정하림");
		System.out.println("=구분선=======================================");		
		gu04("김용주");
		System.out.println("=구분선=======================================");		
		gu04("박여은");
		System.out.println("=구분선=======================================");		
	}

}
