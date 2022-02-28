package collections;

import java.util.*;

public class Collection11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet arranges the elements in random order
		HashSet<String> hs=new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("G");
		hs.add("S");
		hs.add("T");
		hs.add("D");
		System.out.println(hs);
		System.out.println(hs.contains("A"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("P"));
		System.out.println(hs);
		System.out.println(hs.size());
		hs.clear();
		System.out.println(hs.remove("A"));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		
		//take an array of size 10 from user allowing duplicacy and return him the unique elements only
		
		//
		
		
		
	}

}
