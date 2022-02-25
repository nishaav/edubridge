package collections;

import java.util.*;
public class Collection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LinkedList :
	//	1 23 78 4 54 65 
		//numerous shifting is performed because of insertion or deletion of an element
		//results in high overhead cost for the system.
		
		//manipulation in linkedlist is fast as no shifting is performed.
		//arraylist uses dynamic array
		//linkedlist creates a node to hold the data as well as the address of next 
		//and previous nodes
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("A");
		ll.add("D");
		ll.add("D");
		ll.add("E");
		ll.add("F");
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.contains("A"));
		System.out.println(ll.element());//returns the first/topmost element
		System.out.println(ll.get(4));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf("E"));
		System.out.println(ll.isEmpty());
		System.out.println(ll.lastIndexOf("A"));
		System.out.println(ll.peek());//get(0)
		System.out.println(ll.peekFirst());//get(0)
		System.out.println(ll.peekLast());//get(ll.size()-1)
		System.out.println(ll.poll());//removes the first element
		System.out.println(ll.pollFirst());//removes the first element
		System.out.println(ll.pollLast());//removes the last element
		System.out.println(ll.remove(3));
		ll.add(0, "Value");
		ll.addFirst("Collection");
		ll.addLast("LastElement");
		System.out.println(ll);
		//sort the collection
		Collections.sort(ll);//Collections : class sort:static method

		System.out.println(ll);
		
		Collections.reverse(ll);
		System.out.println(ll);
		
		//descending
		//sort
		//reverse
		
		
	}

}
