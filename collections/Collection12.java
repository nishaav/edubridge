package collections;

import java.util.*;

public class Collection12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Queue interface :
		// FIFO : First In First out
		// FCFS : First Come Furst Served
		// 
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Venkat");
		pq.add("Vaishnavi");
		pq.add("Ashish");
		pq.add("Akshat");
		pq.add("Supriya");
		pq.add("Sandhya");
		pq.offer("Narmadha");
		pq.offer("Karthik");
		
		System.out.println(pq);
		
		System.out.println(pq.contains("supriya"));
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.remove("Kartik"));
		System.out.println(pq.size());
		System.out.println(pq);
		System.out.println(pq);
		
		System.out.println(pq);
		
		
		
		
		
	}

}
