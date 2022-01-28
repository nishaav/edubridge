package patternquestions;

import java.util.*;

public class Collection12 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		System.out.println(lhs.isEmpty());
		lhs.add(1);
		lhs.add(7);
		lhs.add(9);
		lhs.add(10);
		lhs.add(8);
		lhs.add(5);
		lhs.add(6);
		lhs.add(0);
		lhs.add(11);
		lhs.add(1);
		
		System.out.println(lhs);
		
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<>();
		System.out.println(lhs.size());
		System.out.println(lhs.contains(2));
		System.out.println(lhs.equals(lhs1));
		System.out.println(lhs.isEmpty());
		
		System.out.println(lhs.remove(7));
		System.out.println(lhs);
		lhs.clear();//tell the reason for error
		System.out.println(lhs);
		
		
		//treeset
		//using sort() method 
		//without using option 1 and 2
//		int max = -1;
//		for(Integer i: lhs) {
//			if(i > max)
//				max = i;
//		}
//		
//		System.out.println("highest : "+max);

		
		
		
	}

}
