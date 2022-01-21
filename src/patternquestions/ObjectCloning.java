package patternquestions;

public class ObjectCloning {

	public static void main(String[] args) {
		//Clone : means exact copy or duplicate.
		
		//Object Cloning means creating the exact copy of the object using the clone() method of Object class which saves processing time which is wasted while we create the
		//instance using new keyword.
		
		
		//disadvantages :
		// 1) a lot of changes in the syntax.
		// 2) need to implement Cloneable interface
		// 3) it will not invoke the constructor.
		// 4) a shallow copy of the instance is created.
		
		try
		{
			Employee emp=new Employee(1,"Jatin");
			Employee emp1=(Employee)emp.clone();
			
			System.out.println(emp);
			System.out.println(emp1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

class Employee implements Cloneable
{
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
//	public String toString()
//	{
//		return empId+" "+empName;
//	}
}
