package patternquestions;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		int ar1[]= {12,23,34,45,67};
		
		int ar2[]=new int[5];
		ar2[0]=12;
		ar2[1]=23;
		ar2[2]=34;
		ar2[3]=45;
		ar2[4]=56;
		
		System.out.println("The elements of the array are : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		System.out.println("The elements of the array are : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar2[i]+" ");
		}
		scanner.close();
	}

}
