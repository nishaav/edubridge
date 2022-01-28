package patternquestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Collection17 {

	public static void main(String[] args) {
		/*
		 * LinkedHashMap :
		 * -> can have 1 null key and multiple null values
		 * -> default capacity : 16 load factor : 0.75
		 * -> stores the elements on the basis of key
		 * -> maintains insertion order
		 */

		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
		hm.put(1,"Venkat");
		hm.put(1, "Poorvi");
		hm.put(2,"Supriya");
		hm.put(3,"Divesh");
		hm.put(4,"Ashish");
		hm.put(5,"Akshat");
		hm.put(null, null);
		hm.put(6,null);
		
		System.out.println(hm);

		LinkedHashMap<Integer,String> hm1=new LinkedHashMap<>();
		hm1.putAll(hm);
		LinkedHashMap<Integer,String> hm2=(LinkedHashMap<Integer,String>)hm.clone();
		System.out.println(hm.containsKey(null));
		System.out.println(hm.containsValue(null));
		System.out.println(hm.equals(hm2));
		System.out.println(hm.get(3));
		System.out.println(hm.isEmpty());
		System.out.println(hm.remove(1));
		System.out.println(hm.remove(2, "Supriya"));
		System.out.println(hm.replace(4, "Aashish"));
		System.out.println(hm.replace(5, "Akshat", "Aman"));
		System.out.println(hm);
		System.out.println(hm.size());
		
		
		for(Map.Entry<Integer, String> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
