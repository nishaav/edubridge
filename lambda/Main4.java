package com.dummy;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=()->{
			System.out.println("Show");
			
		};	
	}
}
interface A
{
	abstract void show();//public abstract void show();
	
}
//to reduce the complexity of the language, lambda expressions are limited to work with
//functional interfaces only.
//SAM : Single Abstract Method