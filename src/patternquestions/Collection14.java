package patternquestions;

import java.util.*;

public class Collection14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("Element1");
		hs.add("Element2");
		hs.add("Element3");
		hs.add("Element4");
		hs.add("Element5");
		hs.add("Element6");
		
		//How the elements in HashSet Collection is arranged?
		
		HashSet<String> hs1=new HashSet<>();
		hs1.addAll(hs);
		hs1.add("Element7");
		
		HashSet<String> hs2=(HashSet<String>)hs.clone();
		
		System.out.println(hs.contains("Element9"));
		
		System.out.println(hs);
		System.out.println(hs1);
		System.out.println(hs1.containsAll(hs));
		
		System.out.println(hs.equals(hs2));
		
		System.out.println(hs2.isEmpty());
		
		System.out.println(hs.remove("Element1"));
		//System.out.println(hs.removeAll(hs2));
		System.out.println(hs.retainAll(hs2));
		System.out.println(hs1.size());
		System.out.println(hs1);
		
	}

}
