package patternquestions;

import java.util.Iterator;
import java.util.ArrayList;
public class Collection1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ramya");
		al.add("Praneetha");
		al.add("Divesh");
		al.add("Dinesh");
		al.add("Mohan");
		al.add("Shovan");

		
		
		
		
		//for loop
		System.out.println("Using for loop : ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//enhanced for loop
		System.out.println("Using enhanced for loop : ");
		/*
		 * for(Datatype varname:arrayname/collectionname)
		 * {
		 * 
		 * }
		 * 1)enhanced for loop 
		 * ->can be used to traverse over the elements of arrays or collections.
		 * ->when we are not sure about the size of collection
		 * ->the travesing variable has to be of the same type as using it we point to the element.
		 */
		for(String str:al)
		{
			System.out.println(str);
		}
		//iterator
		System.out.println("Using iterator : ");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		ArrayList<StudentDemo> studentList=new ArrayList<StudentDemo>();
		StudentDemo student1=new StudentDemo(1,"Aman",23);
		StudentDemo student2=new StudentDemo(2,"Naman",24);
		StudentDemo student3=new StudentDemo(3,"Priya",23);
		StudentDemo student4=new StudentDemo(4,"Shreya",22);
		StudentDemo student5=new StudentDemo(5,"Supriya",21);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		System.out.println("Using for loop");
		
		//for loop
		for(int i=0;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i).age+" "+studentList.get(i).id+" "+studentList.get(i).name);
		}
		
		System.out.println("Using enhanced for loop");
		
		//enhanced for loop
		for(StudentDemo studentDemo:studentList)
		{
			System.out.println(studentDemo.id+" "+studentDemo.name+" "+studentDemo.age);
		}

		//Iterator Interface
		
		System.out.println("Using Iterator interface");
		
		Iterator<StudentDemo> itr1=studentList.iterator();
		while(itr1.hasNext())
		{
			StudentDemo student=itr1.next();
			System.out.println(student.id+" "+student.name+" "+student.age);
		}
	}

}




class StudentDemo
{
	int id;
	String name;
	int age;
	public StudentDemo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
}







