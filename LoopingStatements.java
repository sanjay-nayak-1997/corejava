
public class LoopingStatements {

	public static void main(String[] args) {

		for(int i=0;i<10;i++)
		{
			System.out.println("Sanjay Nayak K, for-loop");
		}
		
		System.out.println();
		
		int i=0;
		do {
			System.out.println("Sanjay Nayak K, do-while-loop");
			i++;
		}while(i<10);
		
		System.out.println();
		
		int j=0;
		while(j<10)
		{
			System.out.println("Sanjay Nayak K, While-loop");
			j++;
		}
		
		for(int k=1;k<=10;k++)
		{
			System.out.print(k + " ");
		}
		System.out.print(", for-loop");
		
		System.out.println();
		int l=1;
		do {
			System.out.print(l + " ");
			l++;
		}while(l<=10);
		System.out.print(", do-while-loop");
		
		System.out.println();
		int m=1;
		while(m<=10)
		{
			System.out.print(m + " ");
			m++;
		}
		System.out.print(", while-loop");
		
		System.out.println();
		for(int n=10;n>=1;n--)
		{
			System.out.print(n + " ");
		}
		System.out.print(", for-loop");
		
		System.out.println();
		int o=10;
		do {
			System.out.print(o + " ");
			o--;
		}while(o>=1);
		System.out.print(", do-while-loop");
		
		System.out.println();
		int p=10;
		while(p>=1)
		{
			System.out.print(p + " ");
			p--;
		}
		System.out.print(", while-loop");
		
		
		
		System.out.println();
		for(int k=1;k<=20;k++)
		{
			if(!(k%2==0))
			{
				System.out.print(k + " ");
			}
		}
		System.out.print(", for-loop");
		
		System.out.println();
		int q=1;
		do {
			if(!(q%2==0))
			{
			System.out.print(q + " ");
			}
			q++;
		}while(q<=20);
		System.out.print(", do-while-loop");
		
		System.out.println();
		int r=1;
		while(r<=20)
		{
			if(!(r%2==0))
			{
			System.out.print(r + " ");
			}
			r++;
		}
		System.out.print(", while-loop");
		
		System.out.println();
		for(int s=1;s<=10;s++)
		{
			System.out.print(s*7 + " ");
		}
		System.out.print(", for-loop");
		
		System.out.println();
		int t=1;
		do {
			System.out.print(t*7 + " ");
			t++;
		}while(t<=10);
		System.out.print(", do-while-loop");
		
		System.out.println();
		int u=1;
		while(u<=10)
		{
			System.out.print(u*7 + " ");
			u++;
		}
		System.out.print(", while-loop");
		 
		System.out.println();
		int num=0;
		for(int v=0;v<=6;v++)
		{
			System.out.print(num + " ");
			num+=v;
		}
		
	}

}
