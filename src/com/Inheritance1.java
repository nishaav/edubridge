package com;

import java.util.Scanner;

//import java.lang.Object;

public class Inheritance1 {

	public static void main(String[] args) {
			
		
//		B b=new B();
//		b.a=12;
//		b.b=90;
//		b.show();
//		b.display();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter name,age,contact,street no,pincode,city : ");
		String name=scanner.next();
		int age=scanner.nextInt();
		String contact=scanner.next();
		String street=scanner.next();
		int pin=scanner.nextInt();
		String city=scanner.next();
		
		User user=new User(name,age,contact,street,pin,city);
		user.show();
	}

	
}


class Address
{
	String streetNo;
	int pinCode;
	String city;
	
	Address()
	{
		
	}
	
	
	Address(String streetNo,int pinCode,String city)
	{
		this.streetNo=streetNo;
		this.pinCode=pinCode;
		this.city=city;
	}
	
	
	//this keyword : this keyword refers to the current class object through which we can access the members inside constructor and methods 
}
class User extends Address
{
	String name;
	int age;
	String contact;
	
	User(String name,int age,String contact,String streetNo,int pinCode,String city)
	{
		super(streetNo,pinCode,city);
		this.name=name;
		this.age=age;
		this.contact=contact;
		
	}
	void show()
	{
		System.out.println(name+" "+age+" "+contact+" "+streetNo+" "+pinCode+" "+city);
	}
	
}


class A
{
	int a;

	void show()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;

	void display()
	{
		System.out.println(b);
	}
}







