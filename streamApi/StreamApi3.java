package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApi3 {

	public static void main(String[] args) {
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
		
		List<EmployeeDetails> empList=al.stream()//returns sequential stream
				.filter(empD->empD.getSalary()>35000)
				.collect(Collectors.toList());

		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(4);
		numbers.add(8);
		List<Integer> evenNumbers=numbers.stream()//returns sequential stream
				.filter(empD->empD%2==0)
				.map(e->(e*e))
				.collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		List<Integer> oddNumbers=numbers.stream()//returns sequential stream
				.filter(empD->empD%2!=0)
				.map(e->(e*e))
				.collect(Collectors.toList());
		
		
		
		System.out.println(oddNumbers);
		Map<Object, Object> map=al.stream()
				.collect(Collectors.toMap(e->e.getId(), e->e.getName()));
		System.out.println(map);
		//Venkat
		Map<Object, Object> map1 = IntStream.range(0, evenNumbers.size())
	            .boxed()
	            .collect(Collectors.toMap(i -> evenNumbers.get(i), i -> oddNumbers.get(i)));
		System.out.println(map1);
	}

}
