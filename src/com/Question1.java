package com;

import java.util.Scanner;

public class Question1 {
public static void main(String args[])
{
	System.out.println("Enter a number : ");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	if(a%2==0)
	{
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
}
}
