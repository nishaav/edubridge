package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// to comment and uncomment
//Windows : ctrl + /
		
//Mac : command + /
		
		ArrayList<StudentInfo> al=new ArrayList<>();
		al.add(new StudentInfo(1,"Jatin",450));
		al.add(new StudentInfo(3,"Manav",670));
		al.add(new StudentInfo(2,"Naman",340));
		al.add(new StudentInfo(5,"Shrey",900));
		al.add(new StudentInfo(7,"Manisha",750));
		//1*2*3*5*7
		double  sum=0;
		
		for(int i=0;i<al.size();i++)
		{
			//sum+=al.get(i).marks;
			sum=sum+al.get(i).marks;
		}
		System.out.println("The Marks of all the candidates are  : "+sum);
		
		double sum1=al.stream().collect(Collectors.summingDouble(si->si.marks));
		System.out.println("The Marks of all the candidates using stream are  : "+sum1);
		
		double avg = al.stream().collect(Collectors.averagingDouble(av->av.marks));
		System.out.println("the students avg are :" +avg);
		
		//count number of records
		long size=al.stream().count();
		System.out.println("Calculate the number of records in a collection : "+size);
		//another sample of count
		long qualifyingRecords=al.stream().filter(s->s.marks>450).count();
		System.out.println("Number of records in a collection whose marks are greater than 450 : "+qualifyingRecords);
		
		//details of candidate who have highest marks
		StudentInfo student=al.stream().max((s1,s2)->s1.marks>s2.marks?1:-1).get();
		System.out.println(student.id+" "+student.name+" "+student.marks);
		
		StudentInfo student1=al.stream().min((s1,s2)->s1.marks>s2.marks?1:-1).get();
		System.out.println(student1.id+" "+student1.name+" "+student1.marks);
	
//		int even=7;
//		int count=1;
//		if(even%2==0)
//		{
//			count++;
//		}
//		else
//		{
//			count--;
//		}
//		//logicalcondition?valueiftrue:valueiffalse;
//		int output=even%2==0?++count:--count;
//		System.out.println(output);
		
//last reduce(): used to reduce the elements and generate a single output for custom expression
		//such as product
		double result=al.stream().map(s->s.id).reduce(1,(product,id)->product*id);
		System.out.println("The product of ids are "+result);
	//product=1
		//product*=id;
		//product=product*id;
	}

}

class StudentInfo
{
	int id;
	String name;
	double marks;
	public StudentInfo(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
