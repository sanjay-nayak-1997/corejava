package github;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListAndIterator {
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.add("Java");
		list.add("CPP");
		list.add("HTML");
		list.add("CSS");
		list.add("C#");
		
		Iterator it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Reading using iterator - " + it.next());
		}
		System.out.println();
		ListIterator it1=list.listIterator(list.size());
		
		while(it1.hasPrevious())
		{
			System.out.println("Reading using list iterator in reverse order - " + it1.previous());
		}
		
		
	}

}
