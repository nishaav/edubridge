package com;

public class SuperInInheritance 
{
	public static void main(String args[])
	{
		In2 in2=new In2();
		in2.display();
	}
}
class In1
{
	int a=10;	
	void show()
	{
		System.out.println("Display method of In1 class");
	}
}
class In2 extends In1
{
	int a=20;
	
	void display()
	{
		
		show();
		System.out.println(super.a);
	}
	
}
/*
 * super : keyword works as an object of parent class.
 * using super, you can call all the non private members of parent in child classes.
 * ->one can call, parent call properties(variables),methods and constructor also.
 * 
 * ->To call parent class methods and variables, use super as an object.
 * ->To call parent class constructor, use super as per constructor signature.
 * 
 * 
 * 
 * 
 */ 
