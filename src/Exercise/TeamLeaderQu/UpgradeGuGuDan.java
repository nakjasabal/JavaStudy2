package Exercise.TeamLeaderQu;

public class UpgradeGuGuDan {

	//26기김병훈
	public static void main(String[] args)
	{
		long result=0L;
		for(int i=2; i<=9; i++)//단
		{
			int j=1;
			while(j<10)
			{
				System.out.print(i);
				if(j==1)
				{
					System.out.print(" X 1");
					result = (long)i * 1L;
					System.out.println(" = "+ result);
				}
				else
				{
					for(int count=1; count<j;count++)
					{
						System.out.print(" X "+ i);
						result = result * (long)i;
					}
					System.out.println(" = "+ result);
				}
				result = (long)i;
				j++;
			}
		}
	}
	
	//26기염승현
	/*public static void main(String[] args) {
		long mul;
		for (int i=2; i<10; i++) {
			for (int j=0; j<9; j++) {
				if (j == 0) {
					System.out.println(i + " x 1 = " + i*(j+1));
				}
				else {
					mul = 1;
					System.out.print(i);
					for (int k=1; k<=j; k++) {
						System.out.print(" x " + i);
						mul *= i;
					}
					System.out.println(" = " + i*mul);
				}
			}
			System.out.println();
		}
	}*/

	//26기정원미
	/*public static void main(String[] args)
	{
		int result;
		
		for(int i=2 ; i<=9 ; i++)
		{
			System.out.println(i + " x " + 1 + "= " + i*1);
			System.out.println("");
			result=i*1;
						
			for(int j=1 ; j<=8; j++)
			{				
				System.out.print(i);				
				result=i;
				
				for(int x=1; x<=j ; x++)
				{
					System.out.print(" x " +i);					
					result*=i;					
				}
				
				System.out.println(" = " + result);
				System.out.println("");
			}			
		}
	}*/

	
	//31기박세창
	/*public static void main(String[] args)
	{
		for(int i=2;i<=9;i++) //i=2
		{
			for(int j=1;j<=9;j++) // j=2 
			{
				int involutionresult = 1;
				
				System.out.print(i);
				if(j==1)
				System.out.print(" X "+ 1);	
				
				for(int k=1;k<=j;k++)
				{
					if((j!=1) && (k!=1))
					System.out.print(" X "+ i);
					involutionresult*=i;
				}
				System.out.print(" = ");
				System.out.print(involutionresult);
				System.out.println("");
			}
			System.out.println("");
		}
	}*/
	
	
	//31기이용현
	/*public static void main(String[] args)
	{	
		for(int i=2 ; i<10 ; i++)
		{
			int result = i;
			
			for(int j=1 ; j<10 ; j++)
			{
				if(j==1)
				{
					System.out.printf("%d X %d = %d\n",i,j,j*i);	
				}				
				else
				{
					result = result*i;
					
					for(int c=0;c<j;c++)
					{						
						if(c!=j-1)
						{
							System.out.printf("%d X ",i);	
						}
						
						else
						{
							System.out.printf("%d = %d\n",i,result);	
						}
					}
				}				
			}			
		}
	}*/
	
	
	//31기임광빈
	/*public static void main(String[] args)
	{
		for(int i=2; i<10; i++)
		{
			int num = i;
			
			System.out.println(i +" x " + 1 + " = " + (i*1));
			
			for(int j=2; j<10; j++)
			{		
				num = num * i;
				
				if(j>=2)
				{	
					for(int n=1; n<=j; n++)
					{			
						System.out.print(i);
						
						if(n<j)
						{
							System.out.print(" x ");
						}
						else
						{
							System.out.print(" = ");
						}
					}
					
					System.out.print(num);
				}
				System.out.println();
			}
		}
	}*/
	
	
	//31기전성표
	/*public static void main(String[] args){
			
		int count = 1;
	
		for(int i = 2; i<=9 ; i++){
			
			System.out.println(i +"X"+ count+"="+i*count);
			
			for(int j = 2; j<=9 ;j++ ){
				
				int num=i;
				
				for(int k = 1; k<=(j) ;k++ ){
					
					if(k==j){
						System.out.print( i + "=" + num);
					}else{
						System.out.print( i + "X");
					}
					num *= i;				
				}			
				
				System.out.println();			
			}			
		}		
	}*/
	
	
	//31기차영재
	/*public static void main(String[] args){

		for(int i=2; i<=9; i++){
			int mul=i;
			System.out.println(i+"*"+"1="+(i*1));
			for(int j=1; j<=9; j++){
				System.out.print(i);
				for(int k=1; k<=j; k++){
					System.out.print("*"+i);
				}
				mul*=i;
				System.out.println("="+mul);
			}
		}
	}*/
	
	//37기이정민
	/*public static void main(String[] args) {

		System.out.println("---------- java ----------");
		int a = 2, b=1, c=1;
		int i=1;
		int j = 1;
		b=a;
		for(a=2;a<=9;a++) {//피연산자
			for(i=0;i<=8;i++) {//곱하는 횟수
				System.out.print(a);
				if(i==0) {
					b = a;
					System.out.print(" * 1");
				}
				else {
					for(j=i-1; j>=0;j--) {
						System.out.print(" * "+a);
					}
					b *= a;
				}
				System.out.print(" = " +b+"\n");
			}
		}
	}*/
	
	
	//37기김진우
	/*public static void main(String[] args) {

		int num;
		String text = " X ";
		for(int i=2; i<10; i++) {
			num = 1;
			for(int j=1; j<10; j++) {
				num *= i;
				System.out.printf("%d", i);
				for(int k=1;k<j;k++) {
					System.out.print(text + i);
				}
				if(j==1) {
					System.out.print(text + j);
				}
				System.out.printf(" = %d\n", num);
			}
		}
	}*/

	
	//37기배재현
	 
	/*2번돌고 나가서 9까지 증가해야함
	 * 나간후 a는 증가해야하고 b는 증가하면 안
 		9번증가한 후에는 앞쪽은1 뒤쪽도 1 증가해야함
	 */
	/*public static void main(String[] args) {
		int a, b,c, d;
		for(a=2 ; a<10 ; a++){
			d=2;
			for(b=1 ; b<10 ; b++) {
				System.out.print(a);
				if(b==1) {
					System.out.println("x"+b+"="+a*b);
				}
				else{
					for(c=1 ; c<d ; c++) {
						System.out.print("x"+a);
					}
					System.out.println("="+(int)Math.pow(a, b));
					d++;
				}
			}        
		}
	}*/
	   
}
