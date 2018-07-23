package github;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero!!");
		}
		System.out.println("End");
		
	}

}
