package github;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetProgram {

	public static void main(String[] args) {
		

		System.out.println();
		HashSet set=new HashSet();
		
		set.add("Zahir");
		set.add("Ram");
		set.add("Peter");
		set.add("James");
		set.add("Peter");
		set.add("Laxman");
		set.add("Arun");
		
		System.out.println(set);
		
		TreeSet set1=new TreeSet();
		
		set1.add("Zahir");
		set1.add("Ram");
		set1.add("Peter");
		set1.add("James");
		set1.add("Peter");
		set1.add("Laxman");
		set1.add("Arun");
		
		System.out.println(set1);
		
		LinkedHashSet set2=new LinkedHashSet<>();
		
		set2.add("Zahir");
		set2.add("Ram");
		set2.add("Peter");
		set2.add("James");
		set2.add("Peter");
		set2.add("Laxman");
		set2.add("Arun");
		
		System.out.println(set2);
	}

}
