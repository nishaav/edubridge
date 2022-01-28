package patternquestions;

import java.util.ArrayList;
import java.util.*;

public class Collection20 {

	public static void main(String[] args) {
		// Comparator

		ArrayList<Demo11> al=new ArrayList<>();
		al.add(new Demo11(23,"Venkat",24));
		al.add(new Demo11(21,"Supriya",22));
		al.add(new Demo11(22,"Geetika",21));
		al.add(new Demo11(32,"Abhishek",25));
		al.add(new Demo11(9,"Vaishnavi",19));

		Collections.sort(al, new IdComp());
		
		for(Demo11 d:al)
		{
			System.out.println(d.id+" "+d.name+" "+d.age);
		}
		Collections.sort(al, new AgeComp());
		
		for(Demo11 d:al)
		{
			System.out.println(d.id+" "+d.name+" "+d.age);
		}

		Collections.sort(al, new NameComp());
		
		for(Demo11 d:al)
		{
			System.out.println(d.id+" "+d.name+" "+d.age);
		}

	}
}


class Demo11
{
	int id;
	String name;
	int age;
	public Demo11(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

class IdComp implements Comparator<Demo11>
{

	@Override
	public int compare(Demo11 o1, Demo11 o2) {
		// TODO Auto-generated method stub
		
		if(o1.id==o2.id)
		{
			return 0;
		}
		else if(o1.id>o2.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}


class AgeComp implements Comparator<Demo11>
{

	@Override
	public int compare(Demo11 o1, Demo11 o2) {
		// TODO Auto-generated method stub
		
		if(o1.age==o2.age)
		{
			return 0;
		}
		else if(o1.age>o2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}


class NameComp implements Comparator<Demo11>
{

	@Override
	public int compare(Demo11 o1, Demo11 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);

	}
	
}


