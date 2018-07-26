import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputDemo {
	
	public static void main(String[] args) throws IOException {
		

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		
		System.out.println("Enter the number : " );
		int num;
		num=Integer.parseInt(b.readLine());
		
		if(num%3==0)
		{
			System.out.println(num + " is divisible by 3");
		}
		else
		{
			System.out.println(num + " is not divisible by 3");
		}
		
		System.out.println("Enter your name : ");
		String name;
		name=b.readLine();
		System.out.println("Enter your city");
		String city;
		city=b.readLine();
		
		System.out.println("Welcome " + name);
		System.out.println("You are living in " + city);
		
		System.out.println("Enter five integers :");
		int arr[]=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(b.readLine());
			sum=sum+arr[i];
		}

		double avg=sum/5;
		
		System.out.println("The average of the 5 numbers is " + avg);
		
		int max=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
		}
		
		System.out.println("The maximum of the five numbers is " + max);
		
	}
	
}
