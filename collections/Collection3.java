package collections;

import java.util.ArrayList;
public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Student> al=new ArrayList<>();
			Student student=new Student(1,"Venkat");
			al.add(student);
			al.add(new Student(2,"Sandhiya"));
			al.add(new Student(3,"Vaishali"));
			al.add(new Student(4,"Jaya"));
			al.add(new Student(5,"Akshat"));
			
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
				//to print a specific value :
				//System.out.println(al.get(i).name);

			}
			System.out.println(al.isEmpty());
			System.out.println(al.indexOf(student));
			System.out.println(al.subList(0, 4));
			al.clear();
			System.out.println(al);
			
//create a collection of Integer class type elements and perform all the operations
			//insert,delete,update,fetch
			
	}

}

class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	public String toString()
	{
		return "Hii "+id+" "+name;
	}
}
