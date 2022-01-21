package com;

public class Loop {

	public static void main(String[] args) {
		//syntax 
		/*
		 *  Loop : is the construct which helps to reduce code redundancy by repeatitively executing the set of statements as per the requirement of the program.
		 *  
		 *  The process of repeatition is referred as Iteration.
		 *  
		 *  
		 *  initial point : initialization : marks the beginning of loop.
		 *  termination point  : condition  : marks the ending point of loop.
		 *  Incrementing/decrementing point : mark the gap value.
		 *  
		 *  types of loop :
		 *  1)Entry Control Loop 
		 *  for
		 *  
		 *  syntax : for(initial;condition;in/de)
		 *  {
		 *  	//set of statements
		 *  }
		 *  
		 *  while
		 *  syntax :
		 *  initial
		 *  while(condition)
		 *  {
		 *  	//set of statements
		 *  	in/de;
		 *  }
		 *  
		 *  Hii
		 *  Hii
		 *  Hii
		 *  Hii
		 *  Hii
		 *  
		 *  2)Exit Control Loop
		 *  do-while
		 *	syntax :
		 *  initial
		 *  do
		 * {
		 * 		//set of statements
		 * 		in/de;
		 * }while(condition); 
		 * Iteration 1
		 * i=1->i=2->i=3->i=4->i=5->i=6
		 * 
		 *  if not able to generate any output through loop : check your condition
		 *  if loop is running infinitely : check incrementing/decrementing point
		 * 
		 */
		System.out.println("For Loop : ");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hii");
		}
		System.out.println("While Loop : ");
		
		//while
		int i=1;
		while(i<=5)
		{
			System.out.println("Hii");
			i++;
		}
		System.out.println("Do-While Loop : ");
		
		i=1;
		do
		{
			System.out.println("Hii");
			i++;
		}while(i<=5);
		
		
	}

}
