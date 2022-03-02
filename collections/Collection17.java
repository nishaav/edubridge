package collections;

import java.util.*;
public class Collection17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,Employee> lhm=new TreeMap<>();
		Employee emp1=new Employee(12,"Geetika");
		Employee emp2=new Employee(67,"Shreya");
		Employee emp3=new Employee(56,"Maneet");
		Employee emp4=new Employee(45,"Haneet");
		
		lhm.put("B", emp1);
		lhm.put("A", emp2);
		lhm.put("D", emp3);
		lhm.put("C", emp4);
		
		System.out.println(lhm);
		
		for(Map.Entry<String,Employee> hm:lhm.entrySet())
		{
			System.out.println(hm.getKey()+" "+hm.getValue().id+" "+hm.getValue().name);
		}
		
	}

}
class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}


//Comparable and Comparator : sort user defined collection
//Stream API : 