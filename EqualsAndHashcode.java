package github;

import java.util.HashSet;
import java.util.Iterator;

public class EqualsAndHashcode {
	
	public static void main(String[] args) {
		
		Fruits f1=new Fruits("Apple","Red",5);
		Fruits f2=new Fruits("Grapes", "Green",6);
		Fruits f3=new Fruits("Apple", "Red",5);
		Fruits f4=new Fruits("Grapes", "Green",6);
		Fruits f5=new Fruits("Apple", "Red",5);
		HashSet<Fruits> hm=new HashSet<Fruits>();
		
		hm.add(f1);
		hm.add(f2);
		hm.add(f3);
		hm.add(f4);
		hm.add(f5);
		Iterator<Fruits> fi=hm.iterator();
		
		while(fi.hasNext())
		{
			System.out.println(fi.next().hashCode());
		}
		System.out.println(hm);
	}
}
class Fruits
{
	int price;
	String name;
	String color;
	public Fruits(String name, String color,int price) {
		super();
		this.name = name;
		this.color = color;
		this.price=price;
	}
	@Override
	public String toString() {
		
		return "[ Fruit name = " + name + " , Fruit color = " + color + " ]";
		
	}
	@Override
	public int hashCode() {
		return price*123;
	}
	@Override
	public boolean equals(Object obj) {
		Fruits f=(Fruits)obj;
		if(this.name==f.name && this.color==f.color)
			return true;
		else
			return false;
	}
}