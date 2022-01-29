package patternquestions;

import java.util.*;
import java.util.Map.Entry;

public class Collection23 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
		hm.put("A", 121);
		hm.put("B", 545);
		hm.put("C", 43);
		hm.put("D", 111);
		hm.put("E", 645);
		hm.put("F", 54);
		hm.put("G", 341);
		hm.put("H", 543);
		hm.put("I", 785);
		
		
		
		for(Map.Entry<String,Integer> e:hm.entrySet())
		{
			
			System.out.println(e.getValue());
			
		}
		
		ArrayList<Map.Entry<String, Integer>> list=new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue()==o2.getValue())
				{
					return 0;
				}
				else if(o1.getValue()>o2.getValue())
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}});
		
System.out.println("My List ");
		for(Map.Entry<String,Integer> e:list)
		{
			
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		

	}

}
