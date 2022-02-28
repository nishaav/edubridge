package collections;
import java.util.*;

public class Collection10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet : 
		//no duplicacy
		//it follows sorted order
		
		//lexicographically : dictionary style
		
		//A Aa Ac
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Naman");
		ts.add("Daman");
		ts.add("Priyansh");
		ts.add("Rohan");
		ts.add("Nuthan");
		ts.add("Ajay");
		ts.add("Aakash");
		ts.add("Rahul");
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.first());
		System.out.println(ts.isEmpty());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());//removes the first element
		System.out.println(ts.pollLast());//removes the last element
		System.out.println(ts);
		
		
		TreeSet<Integer> ts1=new TreeSet<>();
		ts1.add(89);
		ts1.add(90);
		ts1.add(56);
		ts1.add(120);
		ts1.add(10);
		ts1.add(43);
		ts1.add(34);
		ts1.add(23);
		
		System.out.println(ts1.ceiling(36));
		System.out.println(ts1.floor(41));
		System.out.println(ts1.higher(56));
		System.out.println(ts1.lower(56));
		
		
	}

}
