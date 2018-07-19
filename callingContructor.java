
public class callingContructor {
	
	String name;
	callingContructor() {
	}
	
	callingContructor(String nm)
	{
		name=nm;
	}

	public static void main(String[] args) {

		Employee3 e=new Employee3();
		System.err.println(e.name);
		
	}

}
