
public class Display {

	public static void main(String[] args) {

		String name="Sanjay Nayak K";
		System.out.println("My name is " + name);
		
		int a,b,c;
		
		a=10;
		b=20;
		
		int sumOf2Nos=a+b;
		
		System.out.println("The sum of " + a + " and " + b + " is " + sumOf2Nos);
		
		int bDividedBya=b/a;
		
		System.out.println("The result after dividing " + b + " by " + a + " is " + bDividedBya);
		
		c=30;
		
		int formula1=a+b-c;
		
		System.out.println("The result of " + a + "+" + b + "-" + c + " is " + formula1);
		
		int formula2=a-b+c;
		
		System.out.println("The result of " + a + "-" + b + "+" + c + " is " + formula2);
		
		int formula3=a/b/c;
		
		System.out.println("The result of " + a + "/" + b + "/" + c + " is " + formula3);
		
		int formula4=a%b%c;
		
		System.out.println("The result of " + a + "%" + b + "%" + c + " is " + formula4);
		
		int average=(a+b+c)/3;
		
		System.out.println("The average of " + a + "," + b + " and " + c + " is " + average);

	}

}
