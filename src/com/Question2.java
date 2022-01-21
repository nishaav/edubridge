package com;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		if((a%3==0) && (a%6==0))
		{
			System.out.println(a+ " is a multiple of 3 and 6 both");
		}
		else
		{
			System.out.println(a+ " is not a multiple of 3 and 6 both");
		}
		
		//operators:
		
	}

}
