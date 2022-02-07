package com;

// what is a marker or tagged interface?
// what is a functional interface?
public class Abstraction4 {

	public static void main(String args[])
	{
		Pro pro=new Impl2();
		pro.show();
		
		Pro.Dev dev=new Impl();
		dev.display();
	}
	
	
}
//nested interfaces : are useful for grouping the related interfaces/components together into a single unit.
interface Pro
{
	void show();
	interface Dev
	{
		void display();
	}
}

class Impl implements Pro.Dev
{
	public void display()
	{
		System.out.println("defining display()");
	}
}

class Impl2 implements Pro
{
	public void show() 
	{
		System.out.println("defining show()");
	}
	
}


