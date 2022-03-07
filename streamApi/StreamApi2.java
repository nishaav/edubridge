package streamApi;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeDetails> al= new ArrayList<>();
		EmployeeDetails emp=new EmployeeDetails();
		EmployeeDetails emp1=new EmployeeDetails();
		emp.setId(56);
		emp.setName("Aaksh");
		emp.setSalary(32000);
		al.add(emp);
		emp1.setId(45);
		emp1.setName("Anjali");
		emp1.setSalary(48000);
		al.add(emp1);
		EmployeeDetails emp2=new EmployeeDetails();
		emp2.setId(12);
		emp2.setName("Jayant");
		emp2.setSalary(58000);
		al.add(emp2);
		EmployeeDetails emp3=new EmployeeDetails();
		emp3.setId(67);
		emp3.setName("Aparna");
		emp3.setSalary(78000);
		al.add(emp3);
		
		//how to add the data into the collection using getter methods.
		List<String> empNames=al.stream()//returns sequential stream
				.filter(empD->empD.getSalary()>35000)
				.map(EmployeeDetails::getName)//fetching a single element using getter method
				.collect(Collectors.toList());//binding into list
		System.out.println(empNames);
		
		al.stream()
		.filter(empDe -> empDe.getSalary()>35000)
		.forEach(empd->System.out.println(empd.getName()+" "+empd.getSalary()));
		
		
		Scanner scan=new Scanner(System.in);
		int id;
		String name;
		int salary;
		//creating an array
		EmployeeDetails[] empDetails=new  EmployeeDetails[2];
		for(int i=0;i<empDetails.length;i++)
		{
			id=scan.nextInt();
			scan.nextLine();
			name=scan.nextLine();
			salary=scan.nextInt();
			EmployeeDetails em=new EmployeeDetails();
			em.setId(id);
			em.setName(name);
			em.setSalary(salary);
			empDetails[i]=em;
			
			
		}

	}

}


class EmployeeDetails
{
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	
private int id;
private String name;
private int salary;

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getSalary() {
return salary;
}

public void setSalary(int salary) {
this.salary = salary;
}
}