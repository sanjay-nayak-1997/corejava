package github;

public class scenarioBuy {

	public static void main(String[] args) {
		
		int amount=1000;
		
		int cost=75;
		
		int amtlft=amount%cost;
		
		System.out.println("Shawn should have $" + (cost-amtlft) + " to buy another tie");
	}

}
