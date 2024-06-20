package Exercise.Ex04;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		
		for(int i=2 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if(i >= j)
				{
					System.out.print(i+"x"+j+"="+(i*j));
					System.out.print(" ");
				}				
			}
			System.out.println();
		}

	}

}
