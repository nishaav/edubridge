package patternquestions;

import java.util.TreeMap;
import java.util.Map;

public class Collection18 {

	public static void main(String[] args) {
		/*
		 * TreeMap :
		 * -> cannot have null key but can have multiple null values
		 * -> default capacity : 16 load factor : 0.75
		 * -> stores the elements on the basis of key
		 * -> maintains ascending order
		 */
		
		TreeMap<Integer,String> hm=new TreeMap<>();
		hm.put(1,"Venkat");
		hm.put(1, "Poorvi");
		hm.put(5,"Supriya");
		hm.put(4,"Divesh");
		hm.put(3,"Ashish");
		hm.put(2,"Akshat");
		//hm.put(null, null);
		hm.put(6,null);
		
		System.out.println(hm);

		TreeMap<Integer,String> hm1=new TreeMap<>();
		hm1.putAll(hm);
		TreeMap<Integer,String> hm2=(TreeMap<Integer,String>)hm.clone();
		System.out.println(hm.containsKey(1));
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
		System.out.println(hm.firstKey());
		System.out.println(hm.lastKey());
		System.out.println(hm.firstEntry());
		System.out.println(hm.lastEntry());
		System.out.println(hm.putIfAbsent(5, "Praneetha"));
		System.out.println(hm);
		System.out.println(hm.getOrDefault(7, "Default"));
		System.out.println(hm.ceilingKey(0));
		System.out.println(hm.descendingMap());
		System.out.println(hm.lowerEntry(7));
		System.out.println(hm.higherKey(3));
		System.out.println(hm.pollFirstEntry());
		System.out.println(hm.pollLastEntry());
		System.out.println(hm.subMap(2, 6));
		

	}

}
