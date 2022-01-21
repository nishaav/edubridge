package patternquestions;

import java.util.Collections;
import java.util.LinkedList;

public class Collection4 {

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(54);
		ll.add(5342);
		ll.add(12);
		ll.add(432);
		ll.add(354);
		
		ll.add(1, 43);
		System.out.println(ll);
		
		ll.remove(0);
		System.out.println(ll);
		
		System.out.println(ll);
		
		ll.set(0,87);
		System.out.println(ll);
		
		System.out.println("isEmpty ? "+ll.isEmpty());
		
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		ll1.add(56);
		ll1.add(90);
		ll1.add(567);
		ll1.addAll(ll);
		
		
		
		//al.clear();
		System.out.println(ll);
		System.out.println(ll1);
	
		System.out.println("Found ? "+ll1.contains(65));
		System.out.println("Found ? "+ll1.containsAll(ll));
		
		//al1.ensureCapacity(100);: to increase the size of collection to the minimum expected no.of elements.
		
		LinkedList<Integer> ll2=(LinkedList<Integer>)ll1.clone();
		
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
