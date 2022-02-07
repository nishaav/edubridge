package com;

public class Polymorphism3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add=new Add();
		add.add(12, 23);
		add.add(12, 23,45);
		add.add(12.5, 23.4,56.3);
		add.add(12.2, 23.3,67.7,89.9);
		add.add(12.2, 23.3,67.7,89.9,100.2);
	}

}

class Add
{
	void add(double a,double b)
	{
		System.out.println((a+b));
	}
	void add(double a,double b,double c)
	{
		System.out.println((a+b+c));
	}
	void add(double a,double b,double c,double d)
	{
		System.out.println((a+b+c+d));
	}
	void add(double a,double b,double c,double d,double e)
	{
		System.out.println((a+b+c+d+e));
	}
	
}



/*
 * single method that must be able to add n number of values 
 * 
 */
