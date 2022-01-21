package patternquestions;

import java.util.ArrayList;
import java.util.Collections;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ramya");//0
		al.add("Praneetha");//1
		al.add("Divesh");
		al.add("Dinesh");
		al.add("Mohan");
		al.add("Shovan");
		
		al.add(1, "Priya");
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.remove("Venkat"));
		System.out.println(al);
		
		al.set(0, "Rahul");
		System.out.println(al);
		
		System.out.println("isEmpty ? "+al.isEmpty());
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Venkat");
		al1.add("Supriya");
		al1.add("Yogita");
		al1.addAll(al);
		
		//al.clear();
		System.out.println(al);
		System.out.println(al1);
	
		System.out.println("Found ? "+al1.contains("venkat"));
		System.out.println("Found ? "+al1.containsAll(al));
		
		//al1.ensureCapacity(100);: to increase the size of collection to the minimum expected no.of elements.
		
		ArrayList<String> al2=(ArrayList<String>)al1.clone();
		
		System.out.println(al2);
		
		al2.remove(0);
		System.out.println(al2);
		System.out.println(al1);
		
		System.out.println(al1.hashCode());
		System.out.println(al2.hashCode());
		
		System.out.println(al1.subList(0, 3));
		
		Collections.sort(al1);
		Collections.reverse(al1);
		System.out.println(al1);
		
	}

}
