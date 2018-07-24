package github;

public class UsernamePassword {

	public static void main(String[] args) {
		
		String username,password;
		
		if(args.length!=2)
		{
			System.out.println("Please enter the username and password");
		}
		else
		{
			username=args[0];
			password=args[1];
			
			if(username.equals("Sanjay"))
			{
				if(password.equals("Deloitte"))
				{
					System.out.println("You are a valid user");
				}
				else
				{
					System.out.println("Invalid Password");
				}
			}
			else
			{
				System.out.println("Invalid Username");
			}
		}

	}

}
