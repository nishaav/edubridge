package patternquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Collection3 {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<>();
		ll.add("Aman");
		ll.add("Priyansh");
		ll.add("Hemant");
		ll.add("Dinesh");
		ll.add("Madhav");
		ll.add("Jitesh");
		
		ll.add(1, "Priya");
		System.out.println(ll);
		
		ll.remove(0);
		System.out.println(ll);
		
		System.out.println(ll.remove("Venkat"));
		System.out.println(ll);
		
		ll.set(0, "Rahul");
		System.out.println(ll);
		
		System.out.println("isEmpty ? "+ll.isEmpty());
		
		LinkedList<String> ll1=new LinkedList<String>();
		ll1.add("Venkat");
		ll1.add("Supriya");
		ll1.add("Yogita");
		ll1.addAll(ll);
		//al.clear();
		System.out.println(ll);
		System.out.println(ll1);
	
		System.out.println("Found ? "+ll1.contains("venkat"));
		System.out.println("Found ? "+ll1.containsAll(ll));
		
		//al1.ensureCapacity(100);: to increase the size of collection to the minimum expected no.of elements.
		
		LinkedList<String> ll2=(LinkedList<String>)ll1.clone();
		
		System.out.println(ll2);
		
		ll2.remove(0);
		System.out.println(ll2);
		System.out.println(ll1);
		
		System.out.println(ll1.hashCode());
		System.out.println(ll2.hashCode());
		
		System.out.println(ll1.subList(0, 3));
		
		Collections.sort(ll1);
		Collections.reverse(ll1);
		System.out.println(ll1);
	
	}

}
