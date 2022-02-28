package collections;

import java.util.*;

public class Collection13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Deque : Double ended Queue
		//implementation is ArrayDeque class
		//insertion and removal from both the ends.
		//no capacity restrictions
		//it is faster because not synchronised.
		//resizable array.
		
		
		ArrayDeque<String> ard=new ArrayDeque<>();
		ard.add("A");
		ard.add("B");
		ard.add("C");
		ard.add("D");
		ard.add("A");
		ard.add("E");
		ard.offer("F");
		ard.offerFirst("N");
		ard.offerLast("G");
		System.out.println(ard);
		System.out.println(ard.element());
		System.out.println(ard.contains("V"));
		System.out.println(ard.getFirst());
		System.out.println(ard.getLast());
		System.out.println(ard.isEmpty());
		System.out.println(ard.peek());
		System.out.println(ard.peekFirst());
		System.out.println(ard.peekLast());
		System.out.println(ard.poll());
		System.out.println(ard.pollFirst());
		System.out.println(ard.pollLast());
		System.out.println(ard);
		System.out.println(ard.pop());
		System.out.println(ard.size());
		System.out.println(ard.removeLastOccurrence("A"));
		System.out.println(ard);
		
		
	}

}
