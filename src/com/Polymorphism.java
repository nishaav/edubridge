package com;

public class Polymorphism {

	public static void main(String[] args) {
		// Polymorphism : multiple forms of a single entity.
		//poly +morphos : 
		//many + forms
		//example : human being
		//polymorphism :
		//  overloading  (static polymorphism 								 overriding(dynamic polymorphism)
		//  constructor overloading											-> no change in signature/declaration
		//  method overloading												-> changes in definition of method accepted			
		//  -> no change in return type is accepted.						-> between parent and child
		//	-> change in parameter count or datatype is 
		//     accepted
		
		Sample sample=new Sample();
		sample.display();
		sample.show();
		sample.displayOutput();
		
		Car car=new Car();
		car.display();
		car.show();
		
		Car c=new Sample();//upcasting or dynamic method dispatching or runtime polymorphism : trying to cast the object of child into the object of parent implicitly.
		c.display();
		c.show();
		
		Car ca=(Car)new Sample();//explicitly upcasting statement
		
		
		//downcasting :  casting the object of parent into the object of child.
		// to perform downcasting,upcasting is required.
		Sample s=(Sample)ca;
		s.display();
		s.displayOutput();
		s.show();
		
		
		
	}

}
//overloading

class Demo1
{
	int id;
	String name;

	Demo1()
	{
		System.out.println("Welcome User!!");
	}
	Demo1(int id)
	{
		this.id=id;
	}
	Demo1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	
}
//overriding
class Car
{
	void show()
	{
		System.out.println("Calling show()");
	}
	
	void display()
	{
		System.out.println("Calling display()");
	}
}


class Sample extends Car
{
	void show()
	{
		System.out.println("redefining show()");
	}
	
	void display()
	{
		System.out.println("redefining display()");
	}
	
	void displayOutput()
	{
		System.out.println("Calling displayOutput()");
	}
}

