package patternquestions;

import java.util.*;
public class Collection19 {

	public static void main(String[] args) {
		// Sorting user defined collection

		ArrayList<Demo> al=new ArrayList<>();
		al.add(new Demo(23,"Venkat",24));
		al.add(new Demo(21,"Supriya",22));
		al.add(new Demo(22,"Geetika",21));
		al.add(new Demo(32,"Abhishek",25));
		al.add(new Demo(9,"Vaishnavi",19));
		
		Collections.sort(al);
		
		for(Demo d:al)
		{
			System.out.println(d.id+" "+d.name+" "+d.age);
		}
		
		
	}

}

class Demo implements Comparable<Demo>
{
	int id;
	String name;
	int age;
	public Demo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Demo demo) {
//		Demo d=(Demo)o;
		// TODO Auto-generated method stub
		if(age==demo.id)
		{
			return 0;
		}
		else if(age>demo.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

/*
 * Comparable:  
 * 1)java.lang
 * 2)sorts the element on the basis of a single attribute.  
 * 3)modifies the original class
 * 4)Collections.sort(list) 
 * 5)need to override compareTo() method
 * Comparator:
 * 1)java.util
 * 2)sorts the element on the basis of a multiple attribute.  
 * 3)does not modify the original class rather one can create multiple classes as per the sorting required.
 * 4)Collections.sort(list,Comparator) 
 * 5)need to override compare() method
 */



