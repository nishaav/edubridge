package com;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nested Loop : 
		//pattern making 
		
		for(int i=1;i<=5;i++)//outer loop
		{
			for(int j=1;j<=5;j++)//inner loop
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		System.out.println("While loop");
		
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("do-while loop");
		i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(j);
				j++;
			}while(j<=5);
			System.out.println();
			i++;
		}while(i<=5);
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
