package patternquestions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection10 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<>();
		//diamond type inference rule
		
		treeSet.add(1);
		treeSet.add(7);
		treeSet.add(9);
		treeSet.add(10);
		treeSet.add(8);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(0);
		treeSet.add(11);
		treeSet.add(1);
		
		TreeSet<Integer> treeSet1=new TreeSet<>();
		treeSet1.addAll(treeSet);
		
		TreeSet<Integer> treeSet2=(TreeSet<Integer>)treeSet.clone();
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.isEmpty());
		System.out.println(treeSet.subSet(Integer.valueOf(2),Integer.valueOf(8)));
		System.out.println(treeSet.equals(treeSet2));
		//System.out.println(treeSet.remove(1));
		System.out.println(treeSet.floor(3));
		System.out.println(treeSet.ceiling(3));
		System.out.println(treeSet.higher(8));
		System.out.println(treeSet.lower(3));
		System.out.println(treeSet.size());
		//System.out.println(treeSet.contains("Element"));
		
		
		
		//1 2 3 4 5
		//treeSet.subSet(1,4);//1,2,3
		
		System.out.println(treeSet);
		
		for(Integer str:treeSet)
		{
			System.out.println(str);
		}
		
		System.out.println("for loop : ");
		
		//as we do not have get method in treeSet 
		//if one wants to work with get then need to convert set into list
		
		ArrayList<Integer> al=new ArrayList<>(treeSet);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Iterator interface : ");
		
		Iterator<Integer> itr=treeSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
