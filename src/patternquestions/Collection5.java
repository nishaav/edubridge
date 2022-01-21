package patternquestions;

import java.util.LinkedList;

public class Collection5 {

	public static void main(String[] args) {
		//Question
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(12);
		list.add(23);
		list.add(43);
		list.add(464);
		list.add(89);
		list.add(33);
		list.add(42);
		list.add(41);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
//		list.remove(43);
		list.remove(Integer.valueOf(43));
		System.out.println(list);
		
		//HOW TO REMOVE 43 IN THIS CASE.
		//REMOVE ALL ELEMENTS LESS THAN 43
		// SORT THE LIST
		//SEARCH FOR THE INDEX OF 43 in sorted list indexOf=4
//		int i=0;
//		while(i < list.size()) {
//			if(list.get(i) < 43)
//				list.remove(i);
//			
//			i++;
//		}
		
		list.removeIf ( ( Integer i )  -> i<43 );//lambda

		System.out.println(list);
		
		//SEARCH THE MOST REPEATITIVE ELEMENT OF THE COLLECTION
	}

}
