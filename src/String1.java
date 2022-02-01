package stringHandling;

import java.lang.*;
import java.util.Scanner;
public class String1 {

	public static void main(String[] args) 
	{
		
		/*
		 * String is a class 
		 * belongs to java.lang package
		 * 
		 * String Constant Pool,
		 * 
		 * JVM 
		 * 
		 */
		String str="EduBridge";//literal
		String str2="EduBridge";
		//in case of str and str2, both references will be pointing to the same memory area.
		String str1=new String("EduBridge");//new keyword
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		
		int len=str.length();
		
		//System.out.println(str.charAt(len));//str.charAt(9)
		
		System.out.println(str.substring(4));//ridge
		System.out.println(str.substring(2, 7));// ubrid 2 : beginIndex 7 : endIndex(will work to fetch characters from 2 to 6 indexes only
		
		System.out.println(str.contains("b"));//works on case - sensitivity also
		System.out.println(str.isEmpty());
		
		//in case string is allocated null then , output will be NullPointerException 
		String str3="";
		System.out.println(str3.isEmpty());
		//Concatenation : means joining of two strings.
		System.out.println(str.concat(" India"));
		str=str.concat(" India");
		System.out.println(str);
		System.out.println(str2);
		//append will not create a new string rather in case of concat new string needs to be created.
		
		System.out.println(str2.equals("eduBridge"));
		System.out.println(str2.equalsIgnoreCase("eduBridge"));

		String dummy="    String   Sample    ";
		System.out.print(dummy.trim());
		System.out.println("Welcome");
		
		System.out.println(str2.replace('E', 'A'));
		System.out.println(str2.replace("Edu", "Team"));
		
		System.out.println(str2);
		System.out.println(str2.indexOf("B"));
		System.out.println(str2.indexOf("d", 0));
		System.out.println(str2.lastIndexOf("e"));
		System.out.println(str2.lastIndexOf("d", 8));
		
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		char arr[]=str.toCharArray();
		for(char ar:arr)
		{
			System.out.print(ar+",");
		}
		System.out.println();
		String sample="Hey! I Am Working With String Samples";
		String arrString[]=sample.split(" ");//delimiter
		for(String st:arrString)
		{
			System.out.print(st+",");
		}
		System.out.println();
		
		
		Scanner scanner = new Scanner(System.in);
		String str4 = scanner.nextLine();
		int index = str4.indexOf('e');
		System.out.println(index);
		System.out.println(str4.charAt(index)+ str4.substring(index + 1).replace('e', 'A'));

		
		
		// how to replace the second occurence of a character in the string
		
		
		
		//StringTokenizer 
		//StringBuffer and StringBuilder classes
		//Regex : Regular Expression
		//intern() method also.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 * String constant pool
		 */
		
	}

}
