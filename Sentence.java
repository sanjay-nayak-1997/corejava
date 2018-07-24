package github;

public class Sentence {
	
	public static void main(String[] args) {
		int counter=0;
		for(int i=0;i<args[0].length();i++)
		{
			if(args[0].charAt(i)==99 || args[0].charAt(i)==67)
			{
				counter++;
			}
		}
		System.out.println("The character \'c\' appears " + counter + " time/s in the sentence.");
		
	}

}
