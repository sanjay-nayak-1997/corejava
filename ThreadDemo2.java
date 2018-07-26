class IntThread implements Runnable
{

	@Override
	public void run() {

		for(int i=1;i<=5;i++)
			System.out.print(i + " ");
		
	}
	
}
class AlphaThread1 implements Runnable
{

	@Override
	public void run() {
		
		for(char c='A';c<='E';c++)
			System.out.print(c + " ");
		
	}
	
}
public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		

		Thread it=new Thread(new IntThread());
		
		Thread at=new Thread(new AlphaThread1());
		
		it.start();
		
		at.start();
		
	}
	
}
