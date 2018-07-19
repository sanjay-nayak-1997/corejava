package github;

public class ParentChild {

	public static void main(String[] args) {
		
		Parent p1=new Parent();
		
		p1.m1();
		
		Parent p2=new Child();
		
		p2.m1();

	}

}

class Parent {
	
	public void m1()
	{
		System.out.println("Executing m1...Parent");
	}
	public void m2()
	{
		System.out.println("Executing m2...Parent");
	}

}

class Child extends Parent
{
	public void m1()
	{
		System.out.println("Executing m1...Child");
	}
	public void m3()
	{
		System.out.println("Executing m3...Child");
	}
}