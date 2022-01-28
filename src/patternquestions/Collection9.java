package patternquestions;

import java.util.*;

public class Collection9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set : 
		//1)dynamically growable
		//2)always works on unique elements-(duplicacy is not allowed)
		//TreeSet
		//LinkedHashSet
		//HashSet
		
		//TreeSet
		//automatically sorts the elements on ascending order
		
		//LinkedHashSet
		//maintains the insertion order
		
		//HashSet
		//elements are organized on the basis of hashing principle.
		//uses hashing mechanism to store the elements.

		
		TreeSet<String> treeSet=new TreeSet<>();
		//diamond type inference rule
		
		treeSet.add("Element1");
		treeSet.add("Element7");
		treeSet.add("Element3");
		treeSet.add("Element8");
		treeSet.add("Element5");
		treeSet.add("Element6");
		treeSet.add("Element2");
		treeSet.add("Element4");
		treeSet.add("ELement1");
		
		TreeSet<String> treeSet1=new TreeSet<>();
		treeSet1.addAll(treeSet);
		
		TreeSet<String> treeSet2=(TreeSet<String>)treeSet.clone();
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.isEmpty());
		System.out.println(treeSet.subSet("Element1","Element4"));
		System.out.println(treeSet.equals(treeSet2));
		System.out.println(treeSet.remove("ELement1"));
		System.out.println(treeSet.floor("Element6"));
		System.out.println(treeSet.ceiling("Element4"));
		System.out.println(treeSet.size());
		System.out.println(treeSet.contains("Element"));
		
		
		System.out.println(treeSet);
		
		for(String str:treeSet)
		{
			System.out.println(str);
		}
		
		System.out.println("for loop : ");
		
		//as we do not have get method in treeSet 
		//if one wants to work with get then need to convert set into list
		
		ArrayList<String> al=new ArrayList<>(treeSet);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Iterator interface : ");
		
		Iterator<String> itr=treeSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
