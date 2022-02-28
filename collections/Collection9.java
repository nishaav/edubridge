package collections;

import java.util.*;

public class Collection9 {

	public static void main(String[] args) {
		//Set interface : 
		//it works on unique elements
		//it will not allow duplicacy.
		//LinkedHashSet
		//->Insertion order
		//structure is followed as linkedlist means the node architecture
		//
		//TreeSet
		//HashSet
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("a");
		lhs.add("E");
		lhs.add("F");
		
		System.out.println(lhs);//
		System.out.println(lhs.size());//
		System.out.println(lhs.contains("N"));
		System.out.println(lhs.isEmpty());
		
		LinkedHashSet<String> lhs1=(LinkedHashSet<String>)lhs.clone();
		System.out.println(lhs.remove("A"));
		System.out.println(lhs);// B C D a E F
		System.out.println(lhs1);//A B C D a E F
		LinkedHashSet<String> lhs2=new LinkedHashSet<String>();
		lhs2.addAll(lhs);
		System.out.println(lhs2);// B C D a E F
		lhs2.clear();
		System.out.println(lhs2);
		System.out.println(lhs1);
		System.out.println(lhs);
		
//		String arr[]=new String[lhs.size()];
//		arr=(String[])lhs.toArray();//convert collection into an array.
//		
		String arr1[]=lhs.toArray(new String[lhs.size()]);
		
		System.out.println("converting collection into array");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("converting array to collection");
		String colors[]= {"Red","Green","Black","Blue"};
		List list=Arrays.asList(colors);
		System.out.println(list);
		
		Iterator<String> itr=lhs.iterator();//reference to visit the collection
		while(itr.hasNext())//check elements into collection
		{
			System.out.println(itr.next());//print elements of the collection one by one
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
