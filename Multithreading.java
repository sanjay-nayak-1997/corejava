
class NumberThread extends Thread
{
	
	public void run()
	{
		System.out.println(currentThread().getName());
		for(int i=1;i<=5;i++)
		{
			System.out.print(i);
		}
	}
	
}

class AlphaThread extends Thread
{
	@Override
	public void run() {
		
		for(char ch='A';ch<='E';ch++)
		{
			System.out.print(ch);
		}
		
	}
}

public class Multithreading{

	public static void main(String[] args) {
			
		NumberThread nt=new NumberThread();
		
		nt.setName("MyFirstThread");
		
		AlphaThread at=new AlphaThread();
		
		nt.setName("MySecondThread");
		
		nt.start();
		
		at.start();
		
	}
	
}
