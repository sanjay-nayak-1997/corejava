package github;

public class scenarioSalary {

	public static void main(String[] args) {
		
		double salary=55555.55,tax,bonus,utilityAndPhone,lunchAndDinner;
		tax=salary*0.2;
		bonus=salary*1.5;
		utilityAndPhone=bonus;
		lunchAndDinner=salary*0.5;
		
		System.out.println("He saves " + (salary-tax+bonus-utilityAndPhone-lunchAndDinner) + " after all his expenses");

	}

}
