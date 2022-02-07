package com;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EonEraPlus eep=new EonEraPlus();
		eep.fuel();
		eep.mileage();
		eep.stearing();
		Creta ca=new Creta();
		ca.fuel();
		ca.mileage();
		ca.stearing();
	}

}
class MyDummy
{
	void show()
	{
		System.out.println("method of MyDummy Class");
	}
}
class MyDummyChild extends MyDummy
{
	void show()
	{
		System.out.println("method of MyDummyChild class");
	}
}
class HyundaiCar
{
	void fuel()
	{
		System.out.println("Petrol");
	}
	void mileage()
	{
		System.out.println("5");
	}
	void stearing()
	{
		System.out.println("Normal functionality");
	}
}
class EonEraPlus extends HyundaiCar
{
	void fuel()
	{
		System.out.println("Petrol+CNG");
	}
	void mileage()
	{
		System.out.println("5-7");
	}
	void stearing()
	{
		System.out.println("Power Stearing");
	}
}
class Creta extends HyundaiCar
{
	void fuel()
	{
		System.out.println("Diesel");
	}
	void mileage()
	{
		System.out.println("10");
	}
	void stearing()
	{
		System.out.println("Power Stearing");
	}	
}
/*Overriding :
 * ->dynamic polymorphism
 * ->between parent and child class
 * ->we cannot change the signature of method but can change the definition(functionality)
 * ->runtime polymorphism
 * ->inheritance needs to be performed
 * 
 */
