package github;

public class Enumerators {
	enum weekdays{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
	public static void main(String[] args) {
		
		weekdays[] w=weekdays.values();
		
		for(weekdays w1:w)
		{
			System.out.println(w1);
		}
		
	}
}
