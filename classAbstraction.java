abstract class Person1
{
	public boolean doesHeBreathe()
	{
		System.out.println("Every person breathes");
		return true;
	}
	
	public boolean doesHeSleep()
	{
		System.out.println("Every person sleeps");
		return true;
	}
	public abstract boolean doesHeDrive();
}

abstract class Employee extends Person1 {
	
	public abstract boolean doesHeDrive();

}

class Driver extends Employee{

	@Override
	public boolean doesHeDrive() {
		System.out.println("Every driver drives");
		return true;
	}
	
}

public class classAbstraction{

	public static void main(String[] args) {
		
		Driver d=new Driver();
		
		System.out.println("Breathing?" + d.doesHeBreathe());
		System.out.println("Sleeping?" + d.doesHeSleep());
		System.out.println("Driving?" + d.doesHeDrive());
		
	}
}
