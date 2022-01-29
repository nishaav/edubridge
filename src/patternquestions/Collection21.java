package patternquestions;

import java.util.PriorityQueue;

public class Collection21 {

	public static void main(String[] args) {
		// PriorityQueue
		// Queue : 
		// interface 
		// FIFO : First In First Out 
		// FCFS : First Come First Served
		// 
		// PriorityQueue : class 
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Venkat");
		pq.add("Supriya");
		pq.add("Praneetha");
		pq.add("Shovan");
		pq.add("Vaishnavi");
		pq.add("Geetika");
		
		pq.offer("Shubham");
		
		System.out.println(pq);
		
		pq.remove();
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.element());
		
		System.out.println(pq.peek());
		
		System.out.println(pq.contains("nisha"));
		System.out.println(pq.isEmpty());
		System.out.println(pq.size());
		
		System.out.println(pq.remove("Supriya"));
		
		System.out.println(pq);
		
		PriorityQueue<String> pq1=new PriorityQueue<>();
		pq1.addAll(pq);
		pq1.add("Shravani");
		
		System.out.println(pq1);
		
		System.out.println(pq1.containsAll(pq));
		
		System.out.println(pq1.removeAll(pq));
		System.out.println(pq1);
		
		
		
		
		
		
		
		
	}

}
