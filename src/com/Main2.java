package com;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		//System.out.println("Enter 2 values : ");
		/*
		 *  1) Check the number provided by user whether it is even or odd :
		 *  2) Check the number provided by user whether it is a multiple of 3 and 6 both or not.
		
		 */
		System.out.println("Enter Your Name : ");
		
		Scanner scanner=new Scanner(System.in);
		
//		int a=scanner.nextInt();
//		
//		int b=scanner.nextInt();
//		
//		System.out.println("The value provided for the variable a is "+a);
//		System.out.println("The value provided for the variable b is "+b);
		
		//String inputString=scanner.next();
		String inputString=scanner.nextLine();
		// for next() : enter is working as a termination
		//for nextLine() : space is working as a termination
		
		//char variable initialization
		
		char ch=inputString.charAt(0);
		
		System.out.println(inputString);
		System.out.println("The value of char variable is "+ch);
		// TODO Auto-generated method stub
		//User Interaction In Java
		/*
		 * 
		 * java.util.Scanner
		 * Scanner class : is used to work with user-interaction 
		 * 
		 * set of methods are provided by Scanner :
		 * nextInt() : int variable
		 * nextFloat() : float variable
		 * nextLong() : long
		 * nextDouble() : double
		 * next() : String
		 * nextLine() : String
		 * 
		 *
		 * 
		 * 
		 */
		
	}

}
