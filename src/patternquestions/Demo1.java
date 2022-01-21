package patternquestions;

public class Demo1 {

	public static void main(String[] args) {
		
		Student student=new Student(1,"Geetika");
		System.out.println(student);//garbage or reference 
		
		String string=new String("Nisha");
		String str="Rahul";
		
//		Integer i=new Integer(1);
//		System.out.println(i);
		
		System.out.println(string);
		System.out.println(str);
		
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
		return id+" "+name;
	}
}
