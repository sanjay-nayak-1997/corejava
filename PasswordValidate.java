package github;

public class PasswordValidate {
	
	public static void main(String[] args) {
		
		String pass="H2llo*";
		char c[]=pass.toCharArray();
		if(pass.length()<5 || pass.length()>10)
		{
			System.out.println("Password must have min 5 charaters and max 10 characters");
		}
		else
		{
			int u=0,s=0,d=0;
			for(char ch:c)
			{
				if(Character.isLetter(ch))
				{
					if(Character.isUpperCase(ch))
					{
						u++;
					}
				}
				else if(Character.isDigit(ch))
				{
					d++;
				}
				else if(Character.isWhitespace(ch))
				{
				}
				else
				{
					s++;
				}
			}
			if(u==0)
			{
				System.out.println("Password must contain atleast 1 uppercase character");
			}
			else if(d==0)
			{
				System.out.println("Password must contain atleast 1 digit");
			}
			else if(s==0)
			{
				System.out.println("Password must contain atleast 1 special symbol");
			}
			else
			{
				System.out.println("Password is valid");
			}
		}
		
	}
	
}
