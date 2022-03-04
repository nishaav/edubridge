package collections;

import java.util.*;

public class Collection18 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		String str="gaurav";
		str.compareTo("ganesh");
		
		al.add("Venkat");
		al.add("Divesh");
		al.add("Shreya");
		al.add("Pooja");
		al.add("Varsha");
		al.add("Ajay");
		al.add("Naman");
		//lexicographical : alphabetical dictionary styling
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		StudentDetails studentDetails=new StudentDetails(10,"Manav",23);
		
		ArrayList<StudentDetails> al1=new ArrayList<>();
		
		al1.add(studentDetails);
		al1.add(new StudentDetails(3,"Mitali",23));
		al1.add(new StudentDetails(8,"Shreya",25));
		al1.add(new StudentDetails(5,"Venkat",21));
		al1.add(new StudentDetails(2,"Ajay",28));
		al1.add(new StudentDetails(9,"Pooja",22));

		System.out.println(al1);
		
		Collections.sort(al1);
	
		
		System.out.println(al1);
	}

}
class StudentDetails implements Comparable<StudentDetails>
{
	int id;
	String name;
	int age;
	
	public StudentDetails(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return id+" "+name+" "+age;
	}
	@Override
	public int compareTo(StudentDetails o) {
		// TODO Auto-generated method stub
		
		if(id==o.id)
		{
			return 0;//no change in the index
		}
		else if(id>o.id)
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
 * Comparable
 * ->sort the objects of user defined collection on the basis of a single element
 * ->java.lang
 * ->the original class is modified.
 * ->compareTo method needs to be overridden
 * Comparator
 * ->can provide multiple implementations to sort the elements on the basis of different elements.
 * ->java.util
 * ->original class is not modified but we need to create separate classes for the implementation on the basis
 * of different elements.
 * ->compare method needs to be overridden.
 * 
 * 
 * 
 * 
 * 12 2 6 89 1
 * Step 1
 * Iteration 1 : 2 12 6 89 1
 * Iteration 2 : 2 6 12 89 1
 * Iteration 3 : 2 6 12 89 1
 * Iteration 4 : 2 6 12 1 89
 * 
 * Step 2
 * 2 6 12 1 89
 * Iteration 1 : 2 6 12 1 89
 * Iteration 2 : 2 6 12 1 89
 * Iteration 3 : 2 6 1 12 89  
 * 
 * Step 3 
 * 2 6 1 12 89
 * Iteration 1 : 2 6 1 12 89
 * Iteration 2 : 2 1 6 12 89
 * 
 * Step 4
 * 2 1 6 12 89
 * Iteration 1: 1 2 6 12 89
 */
