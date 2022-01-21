package patternquestions;

import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		//find the highest number from 1-D array

int ar[]=new int[5];// array as an object.
		
		Scanner scanner=new Scanner(System.in);
		
		// 0 1 2 3 4
		
		//initialize the array
		//user interaction
		System.out.println("Enter 5 elements : ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextInt();
		}
		
		System.out.println("The elements of the array are : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int highest=ar[0];
		int position=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>highest)
			{
				highest=ar[i];
				position=i+1;
				
			}
		}
		
		System.out.println("The highest element is "+highest+"\nThe position of the element is "+position+"\nThe index of elements is "+(position-1));
		
		
		
		scanner.close();
		
	}

}
