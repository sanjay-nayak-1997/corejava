class greeting
{
	public synchronized void sayHello(String name)
	{
		System.out.print("!");
		System.out.print(name);
		System.out.print("!");
	}
}
class greetingThread extends Thread
{
	String name;
	greeting greet;
	public greetingThread(String name, greeting greet) {
		super();
		this.name = name;
		this.greet = greet;
	}
	
	@Override
	public void run() {
		
		greet.sayHello(this.name);
		
	}
}
public class SynchronisedMethod {
	
	public static void main(String[] args) {
		
		greeting g=new greeting();
		
		greetingThread gt1=new greetingThread("Sanjay", g );
		
		greetingThread gt2=new greetingThread("Deepak", g);
		
		greetingThread gt3=new greetingThread("Varad", g);
		
		greetingThread gt4=new greetingThread("Akash", g);
		
		gt1.start();
		
		gt2.start();
		
		gt3.start();
		
		gt4.start();
		
	}

}
