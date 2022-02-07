package com;

public class FinalKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=10;
		//a=20;
		
	}

}
/*
 * 
 * 
 * Final keyword : used to apply the restrictions
 * constant : const
 * 
 * final keyword 
 * ->variable : constant : no reinitialization will be allowed.
 * ->method : not allowed to override it.
 * ->class : no inheritance is allowed.
 */

 class FinalShow
{
	void show()
	{
		System.out.println("Show method");
	}
}
class ChildFinalShow extends FinalShow
{
	void show()
	{
		System.out.println("Overriding ");
	}
}

