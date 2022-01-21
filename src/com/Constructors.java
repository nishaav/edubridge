package com;

import java.util.Scanner;


//search regarding role of Object class and toString() method in java
/*
 * OOPS concepts : Inheritance
 * 
 */
public class Constructors 
{
	public static void main(String args[])
	{
		Student student=new Student();
		student.studentId=67;
		student.studentName="Jatin";
		student.ch='A';
		student.l=327;
		student.value=678;
		student.percentage=78.6f;
		student.show();
//		System.out.println("int : "+student.studentId);
//		System.out.println("char : "+student.ch);
//		System.out.println("double : "+student.value);
//		System.out.println("long : "+student.l);
//		System.out.println("String : "+student.studentName);
//		System.out.println("float : "+student.percentage);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the id and name : ");
		int id=scanner.nextInt();
		String name=scanner.next();
		
		Employee employee=new Employee(id,name);
//		System.out.println(employee.empId);
//		System.out.println(employee.empName);
		employee.show();
		
		scanner.close();//to avoid resource leak : warning
	}
	/*
	 * 
	 * Constructor :
	 * ->special methods which helps in initialization of the member variables/instance of the class.
	 * ->they are automatically invoked upon the creation of instance for the class.
	 * ->they do not have any return type
	 * ->
	 * 
	 * -> whenever the instance for the class is created, members of the class gets allocated with the memory and default values : because of which no garbage value
	 *    concept prevails in java
	 * 
	 * -> dynamic memory management,Garbage collector : because of which no destructors are required to be created.
	 * Demo demo=new Demo();
	 * class Demo
	 * {
	 * 
	 * 		int a;
	 * 		Demo()//default constructor
	 * 		{
	 * 		
	 * 		}
	 * 		
	 * 		Demo(int num1,String name)//parameterized constructor
	 * 		{
	 * 		
	 * 		}
	 * 
	 * }
	 * 
	 * there are two types of constructors :
	 * 1)default / non-parameterized : which is by default available in every class.
	 * 2)parameterized : to be created as per the requirement.
	 * 
	 * 
	 * 
	 * 
	 */
}


class Student
{
	int studentId;
	String studentName;
	float percentage;
	double value;
	char ch;
	long l;
	
	Student()
	{
		System.out.println("Welcome User!!");
	}
	
	void show()
	{
		System.out.println(studentId+" "+studentName+" "+percentage+" "+value+" "+ch+" "+l);
	}
	
}

class Employee
{
	int empId;
	String empName;
	
	Employee(int eid,String ename)
	{
		empId=eid;
		empName=ename;
	}
	
	void show()
	{
		System.out.println(empId+" "+empName);
	}
	
	
	
}