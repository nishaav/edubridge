package patternquestions;

import java.util.*;

public class Collection22 {

	public static void main(String[] args) {
		// ArrayDeque
		// Deque : Double Ended Queue
		Deque<String> ad=new ArrayDeque<>();//dynamic method dispatching or upcasting
		ad.add("Venkat");
		ad.add("Vani");
		ad.add("Vaishnavi");
		System.out.println(ad);
		ad.addFirst("Supriya");
		ad.addLast("Shreya");
		System.out.println(ad);
		ad.offer("Divesh");
		ad.offerFirst("Fathima");
		ad.offerLast("Akshat");
		System.out.println(ad);
		
		System.out.println(ad.remove());

		System.out.println(ad.remove("Nisha"));
		System.out.println(ad.removeFirst());
		System.out.println(ad.removeLast());
		System.out.println("Other Methods :");
		System.out.println(ad.element());
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad);
		System.out.println(ad.isEmpty());
		
		//ad.clear();
		System.out.println(ad.pop());
		System.out.println(ad.size());
		ad.push("Nisha");
		System.out.println(ad);
		
		ArrayDeque<String> dq=new ArrayDeque<>();
		dq.addAll(ad);
		
		ArrayDeque<String> dq1=dq.clone();
		System.out.println(dq);
		System.out.println(dq1);
		System.out.println(dq1.contains("Nisha"));
		
		
	}

}
