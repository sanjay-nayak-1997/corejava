import java.io.*;

public class ReadMyName {

	public static void main(String[] args) throws IOException {

		String myName;
// to read a single character from the keyboard
//		System.out.println("Enter a Character : ");
//		int str = System.in.read(); 
//		System.out.println("The Character you Entered is " + (char) str);
//to read a string from the keyboard
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		System.out.println("Enter your name : ");
		myName=b.readLine();
		System.out.println("Enter your age  : ");
		int age=Integer.parseInt(b.readLine());
		System.out.println("Your name is " + myName);
		System.out.println();
		System.out.println("Your age is " + age);
		
	}

}
