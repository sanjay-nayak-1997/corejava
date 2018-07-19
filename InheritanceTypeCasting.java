class A
{
	int a=50;
}
class B extends A
{
	int a=25;
}
public class InheritanceTypeCasting {

	public static void main(String[] args) {
		
		B b=new B();
		
		System.out.println(((A)b).a);

	}

}
