package com;
import java.util.Scanner;
public class Aggregation3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter firstName : ");
		String fname=sc.next();
		System.out.println("Enter middleName : ");
		String mname=sc.next();
		System.out.println("Enter lastName : ");
		String lname=sc.next();
		System.out.println("Enter contact : ");
		String contact=sc.next();
		System.out.println("Enter department : ");
		String dept=sc.next();
		System.out.println("Enter basicPay : ");
		int bpay=sc.nextInt();
		System.out.println("Enter E.allowance : ");
		int eAllowance=sc.nextInt();
		System.out.println("Enter incentive : ");
		int incentive=sc.nextInt();
		
		EmpName en=new EmpName(fname,mname,lname);
		Salary salary=new Salary(bpay,eAllowance,incentive);
		EmpDetails empDetails=new EmpDetails(en,contact,dept,salary);
		empDetails.display();
		
		//input from user
	}
}

class Salary
{
	int basicPay;
	int entertainmentAllowance;
	int incentive;
	public Salary(int basicPay, int entertainmentAllowance, int incentive) {
		super();
		this.basicPay = basicPay;
		this.entertainmentAllowance = entertainmentAllowance;
		this.incentive = incentive;
	}
}
class EmpName
{
	String fName,mName,lName;

	public EmpName(String fName, String mName, String lName) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}	
}

class EmpDetails
{
	EmpName empName;//new EmpName(fname,mname,lname);
	String contact,department;
	Salary salary;
	
	public EmpDetails(EmpName empName, String contact, String department, Salary salary) {
		super();
		this.empName = empName;
		this.contact = contact;
		this.department = department;
		this.salary = salary;
	}

	void display()
	{
		
		System.out.print("Name : ");
		System.out.println(empName.fName+" "+empName.mName+" "+empName.lName);
		
		System.out.println("Contact : "+contact);
		System.out.print("Department : ");
		System.out.println(department);
		System.out.print("Salary : ");
		System.out.println(salary.basicPay+salary.entertainmentAllowance+salary.incentive);
		//method should be able to provide details about empname,contact and salary
		//salary=addition of basicPay+entertainmentAllowance+incentive
	}
}




