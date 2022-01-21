package com;

public class Loop3 {

	static void sol4()
	{
		int n = 3;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}

			System.out.println();
		}
		for (int i = n-1; i >= 1; i--)
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int l = i-1; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}

	}
	
	
	public static void main(String[] args) {

		//pattern4();
		//op2Pattern4();
		sol3();
		sol4();
//		sol1();
//		sol2();
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 
		 * 
		 * 
		 * 5 4 3 2 1
		 * 4 3 2 1
		 * 3 2 1
		 * 2 1
		 * 1
		 * 
		 * 
		 * 
		 */
//		System.out.println("Pattern 1 : ");
//		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("Pattern 2 : ");
//		for(int i=5;i>=1;i--)
//		{
//			for(int j=i;j>=1;j--)
//			{
//		         System.out.print(j+" ");
//		      }
//			System.out.println();
//		}
	/*
	 * 1
	 * 2 1
	 * 3 2 1
	 * 4 3 2 1
	 * 5 4 3 2 1
	 * 
	 * 
	 * 
	 * 
	 * 	
	 */
		
//		System.out.println("Pattern 3 : ");
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=i;j>=1;j--)
//			{
//		         System.out.print(j+" ");
//		      }
//			System.out.println();
//		}
		/*
		 * 
		 * 1 2 3 4 5
		 * 2 3 4 5
		 * 3 4 5
		 * 4 5
		 * 5
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	
	static void pattern4()
	{
		/*
		 *          1
  				  1 * 1
                1 * 1 * 1 
		 * 
		 * 
		 */
		for(int i=1;i<=3;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if(k%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
		
		
		
	}
	
	static void sol1()
	{
		System.out.println("Pattern 4 : ");
		int n = 3;
		for (int i = 1; i <= n; i++) {
	
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}

			System.out.println();
		}

	}
	
	static void sol2()
	{
		System.out.println("Pattern 5 : ");
		int n = 4;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}
	
	
	static void op2Pattern4()
	{
		for(int i=1;i<=3;i++)//rows
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("1");
				}
			}
			for(int l=i-1;l>=1;l--)
			{
				if(l%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("1");
				}
			}
			
			System.out.println();
			
		}
		for(int i=2;i>=1;i--)//rows
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("1");
				}
			}
			for(int l=i-1;l>=1;l--)
			{
				if(l%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("1");
				}
			}
			
			System.out.println();
			
		}
	}
	static void sol3()
	{
		int n=4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}
}
