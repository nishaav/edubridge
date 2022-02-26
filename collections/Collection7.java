package collections;

import java.util.Vector;
public class Collection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Vector class :
		//dynamic array
		////insertion order
		//duplicacy is allowed
		//Difference between arraylist and vector
		//vector is synchronized
		//vector contains various legacy methods.
		//const final 
		//legacy methods : which have been modified time to time as per the requirement rather than being deprecated.
		//synchronized : means one request at a time which makes it slow as compared to arraylist
		
		
		Vector<String> vector=new Vector<>();
		System.out.println(vector.isEmpty());
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		vector.add("E");
		
		Vector<String> vector2=new Vector<>();
		vector2.addAll(vector);
		
		Vector<String> vector3=(Vector<String>)vector.clone();//making a duplicate copy of the collection
		
		
		vector.add("F");
		vector.add("G");
		vector.add("H");
		vector.add("I");
		
		
		vector3.add("jghjhgfj");
		
		System.out.println(vector);
		System.out.println(vector2);
		System.out.println(vector3);
		
		System.out.println(vector.capacity());
		System.out.println(vector.contains("Z"));
		System.out.println(vector.firstElement());
		System.out.println(vector.elementAt(0));
		System.out.println(vector.get(0));
		System.out.println(vector.indexOf("A"));
		System.out.println(vector.lastIndexOf("A"));
		System.out.println(vector.containsAll(vector3));
		System.out.println(vector.lastElement());
		System.out.println(vector.removeElement("F"));
		vector.removeElementAt(5);
		System.out.println(vector.size());
		System.out.println(vector.set(0, "Collection"));//RETURNS THE ELEMENT WHICH IS GETTING REPLACED.
		System.out.println(vector.subList(0, 3));
		vector.clear();
		System.out.println(vector);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
