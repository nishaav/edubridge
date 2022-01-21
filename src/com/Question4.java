package com;

import java.util.Scanner;

public class Question4 {

	//taking an input from the user
	// will be checking the same for vowel and consonant
	// if as well as by switch
	
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character : ");
		String str=scanner.next();
		char ch=str.charAt(0);
		vowelAndConsonantByIf(ch);
		vowelAndConsonantBySwitch(ch);
	}
	
	static void vowelAndConsonantByIf(char ch)
	{
		//	if(((ch>=65) &&(ch<=90)) ||((ch>=97) && (ch<=122)))
		
		if(((ch>='A') &&(ch<='Z')) ||((ch>='a') && (ch<='z')))
		{
			if((ch=='a') ||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A') ||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
			{
				System.out.println("Entered character is a vowel");
			}
			else
			{
				System.out.println("Entered character is a consonant");	
			}
		}
		else
		{
			System.out.println("Entered character is not an alphabet");
		}
	}
	
	static void vowelAndConsonantBySwitch(char ch)
	{
		if(((ch>='A') &&(ch<='Z')) ||((ch>='a') && (ch<='z')))
		{
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': System.out.println("Entered character is a vowel");
				break;
			default : System.out.println("Entered character is a consonant");
			}
		}
		else
		{
			System.out.println("Entered character is not an alphabet");
		}
		
		
	}
}
