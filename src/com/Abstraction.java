package com;

public class Abstraction {

	public static void main(String[] args) {
		/*
		 * Abstraction: the process of hiding the implementation details and showing only the necessary features or functionality to the user.
		 * 
		 * how to achieve abstraction :
		 * 1)abstract class
		 * 2)interfaces
		 * 
		 * till java 7 
		 * abstract classes : 0-100% abstraction
		 * interfaces : 100% abstraction
		 * 
		 * using abstraction, you are able to focus what is to be done not how is to be done.
		 * abstract classes :
		 * 1)can have abstract and non-abstract methods
		 * 2)cannot be instantiated.: 
		 * 3)can have constructors and static methods.
		 * 4)can have final methods also.
		 * 
		 * 
		 * 
		 */
		
		
		Hp hp=new Hp();
		hp.companyName();
		hp.cost();
		hp.graphicCard();
		hp.internalConfiguration();
		hp.modelNo();
		hp.processorInfo();
		hp.warrantyDuration();
		
		Laptop laptop=new Lenovo();//dynamic method dispatching
		laptop.companyName();
		laptop.cost();
		laptop.graphicCard();
		laptop.internalConfiguration();
		laptop.modelNo();
		laptop.processorInfo();
		laptop.warrantyDuration();
		
		
	}
	

}
abstract class Laptop
{
	void cost()
	{
		System.out.println("Rs. 45000");
	}
	abstract void companyName();
	abstract void modelNo();
	abstract void warrantyDuration();
	abstract void internalConfiguration();
	abstract void processorInfo();
	abstract void graphicCard();
}
class Hp extends Laptop
{
	void companyName()
	{
		System.out.println("HP");
	}
	void modelNo()
	{
		System.out.println("789dhfg");
	}
	void warrantyDuration()
	{
		System.out.println("2 Years");
	}
	void internalConfiguration()
	{
		System.out.println("8GB RAM|1TB SSD");
	}
	void processorInfo()
	{
		System.out.println("Intel core i5 Processor");
	}
	void graphicCard()
	{
		System.out.println("2GB GC");
	}
}
class Lenovo extends Laptop
{
	void companyName()
	{
		System.out.println("Lenovo");
	}
	void modelNo()
	{
		System.out.println("uyufns487328");
	}
	void warrantyDuration()
	{
		System.out.println("1 Years");
	}
	void internalConfiguration()
	{
		System.out.println("8GB RAM|512GB SSD");
	}
	void processorInfo()
	{
		System.out.println("Intel core i7 Processor");
	}
	void graphicCard()
	{
		System.out.println("2GB GC");
	}
}












