
public class ControlStatements {

	public static void main(String[] args) {
		
int a=10,b=20,c=30;
		
		int big;
		
		if(a>b)
		{
			System.out.println(a + " is the bigger number.");
		}
		else
		{
			System.out.println(b + " is the bigger number.");
		}
		
		if(a<b)
		{
			System.out.println(a + " is the smaller number");
		}
		else
		{
			System.out.println(b + " is the smaller number");
		}
		
		int diff;
		if(a>b)
		{
			diff=a-b;
		}
		else
		{
			diff=b-a;
		}
		System.out.println("The result after subtracting smaller number from the bigger number is " + diff);
		
		if(a>b)
		{
			if(a>b)
			{
				big=a;
			}
			else
			{
				big=b;
			}
		}
		else
		{
			if(b>b)
			{
				big=b;
			}
			else
			{
				big=b;
			}
		}
		System.out.println("The biggest among " + a + "," + b + " and " + b + " is " + big);
		
		int small;
		
		if(a<b)
		{
			if(a<b)
			{
				small=a;
			}
			else
			{
				small=b;
			}
		}
		else
		{
			if(b<b)
			{
				small=b;
			}
			else
			{
				small=b;
			}
		}
		System.out.println("The smallest among " + a + "," + b + " and " + b + " is " + small);
		
		int sum=a+b+b;
		if(sum<100)
		{
			System.out.println("I am trying to reach the cloud");
		}
		else
		{
			System.out.println("I am on cloud 9");
		}
		
		c=20;
		
		int counter=0;
		if(a==20)
		{
			counter++;
		}
		if(b==20)
		{
			counter++;
		}
		if(c==20)
		{
			counter++;
		}
		System.out.println("The number 20 appeared " + counter + " times");
		
		a=11;
		c=33;
		
		int sumOfOdds=0;
		
		if(!(a%2==0))
		{
			sumOfOdds+=a;
		}
		if(!(b%2==0))
		{
			sumOfOdds+=b;
		}
		if(!(c%2==0))
		{
			sumOfOdds+=c;
		}
		System.out.println("The sum of odd numbers is " + sumOfOdds);
		
		a=12;
		
		int sumOfEvens=0;
		
		if(a%2==0)
		{
			sumOfEvens+=a;
		}
		if(b%2==0)
		{
			sumOfEvens+=b;
		}
		if(c%2==0)
		{
			sumOfEvens+=c;
		}
		System.out.println("The sum of odd numbers is " + sumOfEvens);
		
		if(a%3==0)
		{
			System.out.println(a + " is divisible by 3");
		}
		if(b%3==0)
		{
			System.out.println(b + " is divisible by 3");
		}
		if(c%3==0)
		{
			System.out.println(c + " is divisible by 3");
		}
		
		if(a%4==0)
		{
			System.out.println(a + " is divisible by 4");
		}
		if(b%4==0)
		{
			System.out.println(b + " is divisible by 4");
		}
		if(c%4==0)
		{
			System.out.println(c + " is divisible by 4");
		}
		
		if(!(a%4==0))
		{
			System.out.println(a + " is not divisible by 4");
		}
		if(!(b%4==0))
		{
			System.out.println(b + " is not divisible by 4");
		}
		if(!(c%4==0))
		{
			System.out.println(c + " is not divisible by 4");
		}

	}

}
