
public class PatternPrinting {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<10;j++)
			{
				if(j%2!=0)
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}