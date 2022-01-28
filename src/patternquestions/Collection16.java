package patternquestions;

import java.util.*;



/*
 * 
 * Map Interface (stores the elements on the basis of key )
 * the combination of key and value is referred as a set.
 * 
 * -> storing,updating and deleting  as well as for searching the records from the collection.
 * 
 * ->keys are unique
 * ->values can be duplicated.
 * 
 * ->HashMap: does maintain any order
 * ->LinkedHashMap : insertion order
 * ->TreeMap : ascending order
 * 
 * 
 * HashMap
 * -> can have 1 null key and multiple null values
 * -> default capacity : 16 load factor : 0.75
 * 
 * 
 * 
 */
public class Collection16 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Venkat");
		hm.put(1, "Poorvi");
		hm.put(2,"Supriya");
		hm.put(3,"Divesh");
		hm.put(4,"Ashish");
		hm.put(5,"Akshat");
		hm.put(null, null);
		hm.put(6,null);
		
		System.out.println(hm);

		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.putAll(hm);
		HashMap<Integer,String> hm2=(HashMap<Integer,String>)hm.clone();
		System.out.println(hm.containsKey(null));
		System.out.println(hm.containsValue(null));
		System.out.println(hm.equals(hm2));
		System.out.println(hm.get(3));
		System.out.println(hm.isEmpty());
		System.out.println(hm.remove(1));
		System.out.println(hm.remove(2, "Supriya"));
		System.out.println(hm.replace(4, "Aashish"));
		System.out.println(hm.replace(5, "Akshat", "Aman"));
		System.out.println(hm.size());
		
		
		for(Map.Entry<Integer, String> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
