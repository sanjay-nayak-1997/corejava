package github;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.crypto.dsig.CanonicalizationMethod;

class Car implements Comparable<Car>
{
	String brand;
	double price;
	public Car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "( Brand = " + brand + ", Price = " + price + ")";
	}
	@Override
	public int compareTo(Car o) {
		
		return (int)(price-o.price);
		
	}
	
}
class brandComparator implements Comparator<Car>
{

	@Override
	public int compare(Car o1, Car o2) {
		return o1.brand.compareTo(o2.brand);
	}
	
}

class UsingComparableInterface {
	
	public static void main(String[] args) {
		
		Car c1=new Car("Mitsubishi", 1200000.00);
		Car c2=new Car("Jeep", 2200000.00);
		Car c3=new Car("Tata`", 100000.00);
		
		ArrayList<Car> al=new ArrayList<Car>();
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		System.out.println("Before Sorting...");
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println();
		System.out.println("After Sorting...based on price");
		System.out.println(al);
		
		Collections.sort(al,new brandComparator());
		
		System.out.println();
		System.out.println("After Sorting...based on brand");
		System.out.println(al);
		
	}

}
