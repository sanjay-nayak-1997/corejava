
public class MainThread {

	public static void main(String[] args) {

		
		MyThread1 m1=new MyThread1();
		
		MyThread2 m2=new MyThread2();
		
		m1.start();
		
		m2.start();
		
	}

}
class MyThread1 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
			System.out.print(i + " ");
		
	}
	
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		
		for(int i=15;i<=20;i++)
			System.out.print(i + " ");
		
	}
}
