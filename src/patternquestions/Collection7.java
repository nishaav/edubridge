package patternquestions;

import java.util.*;

/*
 * Vector class :
 * Vector is an implementation of List interface
 * It is a part of Collection Framework since jdk 1.2.
 * As an implementation of list,dynamically growable and allows duplicacy as well.
 * 
 * When we should work with Vector
 * ->When we need to perform thread safe operations as it is synchronized.
 * ->It also contains many legacy methods which are not a part of the collection framework.
 * 
 */




public class Collection7 {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("Element 1");
		vector.add("Element 2");
		vector.add("Element 3");
		vector.add("Element 4");
		vector.add("Element 5");
		vector.add("Element 6");
		vector.add(0, "Element 0");
		vector.addElement("Element 7");
		vector.add("Element 4");
		vector.add("Element 4");
		vector.add("Element 8");
		vector.add("Element 9");
		vector.add("Element 10");
		System.out.println(vector.capacity());
		System.out.println(vector.remove(0));
		System.out.println(vector.remove("ELement 6"));
		System.out.println(vector);
		System.out.println(vector.contains("Element 8"));
		Vector<String> vector1=(Vector<String>)vector.clone();
		System.out.println(vector1.containsAll(vector));
		System.out.println(vector.indexOf("Element 8"));
		System.out.println(vector.indexOf("Element 7"));
		System.out.println(vector.elementAt(0));
		//vector.removeAllElements();
		System.out.println(vector);
		vector.add("Element 12");
		vector.add("Element 13");
		vector.add("Element 14");
		vector.add("Element 15");
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.lastIndexOf("Element 4"));
		System.out.println(vector.lastIndexOf("Element 4",10));
		System.out.println(vector.get(9));
		System.out.println(vector.isEmpty());
		vector.insertElementAt("Element 11", 0);
		System.out.println("Vector 1");
		System.out.println(vector1);
		System.out.println("Vector");
		System.out.println(vector);
		//retainAll() : 
		vector.retainAll(vector1);
		System.out.println("Retain All Vector");
		System.out.println(vector);

		
		
	}

}
