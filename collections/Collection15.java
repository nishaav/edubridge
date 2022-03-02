package collections;

import java.util.*;
public class Collection15 {

	public static void main(String[] args) {
TreeMap<Integer,String>tm=new TreeMap<>();
		tm.put(8, "Yashvika");
		tm.put(2,"Ajay");
		tm.put(4, "Anu");
		tm.put(3, "Geetu");
		tm.put(5, "Meenu");
		//tm.put(null, "jhf");
		System.out.println(tm);
		
		tm.put(1, "Sakthi");
		System.out.println(tm);
		
		tm.putIfAbsent(6,"Vicky");
		System.out.println(tm);
		
		TreeMap<Integer,String> tm1=(TreeMap<Integer,String>)tm.clone();
		tm1.put(9,"Subi");
		
		System.out.println(tm.containsKey(3));
		System.out.println(tm.containsValue("Aakash"));
		System.out.println(tm.equals(tm1));
		System.out.println(tm.get(5));
		System.out.println(tm.getOrDefault(13,"Tharun"));
		System.out.println(tm.isEmpty());
		System.out.println(tm1.remove(6));
		System.out.println(tm.replace(3,"Vaishu"));
		System.out.println(tm);
		System.out.println(tm1);
		
		System.out.println(tm.size());
		
		for(Map.Entry<Integer,String> hm:tm.entrySet())
		{
			System.out.println(hm.getKey()+"."+hm.getValue());
		}
		
		for(Map.Entry<Integer,String> hm1:tm1.entrySet())
		{
			System.out.println(hm1.getKey()+"."+hm1.getValue());
		}

	}

}
