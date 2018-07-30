class Places implements Cloneable{
	
	String name;
	String country;
	long population;
	public Places(String name, String country, long population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class CloneableExample {

	public static void main(String[] args) {
		
		Places p1=new Places("Mumbai", "India", 945674L);
		Places p2=null;
		try {
			p2=(Places) p1.clone();
		} catch (CloneNotSupportedException e) {
			
			System.out.println("Error!");
			
		}
		
		System.out.println(p1);
		System.out.println(p2);
		
		p2.name="Gurgaon";
		System.out.println(p1.name);
		System.out.println(p2.name);

	}

}
