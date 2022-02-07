package com;

public class FinalKeyword {

	
	final int INTEREST_RATE=10;//screaming snake case
	
	void show()
	{
		//a=20;
		System.out.println(INTEREST_RATE);
	}
	
	public static void main(String args[])
	{
		FinalKeyword fk=new FinalKeyword();
		fk.show();
	}
}
/*
 * 
 * 
 * 
 * Polymorphism
 * final
 * Aggregation
 * 
 * const 1.5 final
 * 
 * final  : restrictions on the class and its components
 * 
 * 
 * 
 * variable : makes the variable constant means no reinitialisation will be allowed.
 * method: overriding is not allowed.
 * class: inheritance will not be allowed.
 * 
 */ 

class Clock
{
	final void display()
	{
		System.out.println("calling display");
	}
}

final class Eclipse extends Clock
{
	int a;
	void show()
	{
		System.out.println("demo");
	}
	
//	void display()
//	{
//		System.out.println("redefining");
//	}
}
//class Hp extends Eclipse
//{
//	
//}