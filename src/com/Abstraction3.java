package com;

public class Abstraction3 {

	public static void main(String[] args) {
		
		Caps cap=new Caps();
		Caps.display();
		cap.show();
	}

}

// java 8
/*
 * Improvement : update in interfaces
 * 
 * 
 * Abstract class																Interface
 * -> abstract class can have abstract and non-abstract methods					Interface till java 7 can have only abstract methods. Java 8 onwards can have both default 
 * 																				and static methods.
 * -> abstract classes cannot support multiple inheritance.						Using interfaces, we can implement multiple inheritance in java.
 * ->abstract class can extend another class or can implement 					An interface can only extend another interface.
 * an interface
 * -> here we use extends keyword												we use implements keyword
 * -> abstract class can have final,non-final,static, non-static 				interfaces can have final and static member variables only.
 * member variables.
 * 
 * 
 * 
 * -> default
 * 
 */

abstract class D extends Abcd implements Home
{
	
}
interface Home
{
	default void show()
	{
		System.out.println("Welcome User!!");
	}
	static void display()
	{
		System.out.println("static method in home interface");
	}
}
class Caps implements Home
{
	public void show()
	{
		System.out.println("Overriding show of interface");
	}
	
	public static void display()
	{
		System.out.println("Overriding display of interface");
	}
}


