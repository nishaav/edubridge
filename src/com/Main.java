package com;

public class Main {

	
	static int a=20;//static variable
	
	int iVar=20;//instance variable or non-static 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IDE : Integrated Development Environment
		// compiles on the spot
		// no need to fire the command for compilation and execution as it will be managed implicitly by the IDE.
		
		//static int b=20;
		//Object creation to call non-static members 
		//Non-static members to get called under the main method needs an instance/object
		
		//className referencevariablename=new className();
		Main main=new Main();
		//Main -> className
		//main -> name of reference variable
		//new -> keyword->dynamic memory allocator
		//Main() -> constructor of the class
		System.out.println(main.iVar);
		main.show();
		int lVar=20;
		System.out.println(a);
//		System.out.println(var);
		//Sysout->Ctrl+space->System.out.println();
	}
	
	void show()
	{
		//static int b=20;
		int var=20;
		
		System.out.println(iVar);
		System.out.println(a);
//		System.out.println(lVar);
	}
}
