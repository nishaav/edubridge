package com;

public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1.demo();
		
		Child1 c=new Child1();
		c.show();
	}

}
class Parent
{
	int a=10;
	
	void show()
	{
		System.out.println("Welcome to class Parent!!");
	}
	
}

class Child1 extends Parent
{
	int a=20;
	
	static void demo() {
		Parent p = new Parent();
		System.out.println(p.a);
		p.show();
		Child1 c = new Child1();
		System.out.println(c.a);
	}
	
	void show()
	{
		System.out.println(super.a+ " "+this.a);
		super.show();
	}

	
}