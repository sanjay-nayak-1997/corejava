package github;

public class ReadCharacters {

	public static void main(String[] args) {
		
		String str="Deloitte works for 9 hours*";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				System.out.println(str.charAt(i)+" is a digit.");
			}
			else if(Character.isLetter(ch))
			{
				System.out.println(str.charAt(i)+" is a letter.");
			}
			else if(!(Character.isWhitespace(ch)))
			{
				System.out.println(str.charAt(i)+" is a special symbol.");
			}
			
			
		}

	}

}
