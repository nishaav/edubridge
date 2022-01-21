package patternquestions;

public class Duplicate {

	public static void main(String[] args) {
		// Find the most repetitive number from the array In case all are unique then print "UNIQUE ARRAY"
// If two numbers are repeated same number of times, print both the numbers.
		
		/*
		 * 
		 * 
		 */
		
	
		System.out.println("Duplicates are  : ");
		int ar[]= {1,2,3,4};
		int k=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					
					System.out.println(ar[j]);
					k++;
				
				}
				
			}
		}
		if(k==0)
		{
			System.out.println("UNIQUE ARRAY");
		}
		
	}

}










/*
 * package demo;

import java.util.Scanner;

public class RepeatedArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int k=0;
		        int [] arr = new int [5];
		         Scanner sc = new Scanner(System.in);

		        System.out.print("Enter 5 numbers:");
		        for (int i = 0; i < 5; i++) {
		            arr[i] = sc.nextInt();
		        }
		          
		        System.out.println("Duplicate elements in given array: ");  
		        //Searches for duplicate element  
		        for(int i = 0; i < arr.length; i++) {  
		            for(int j = i + 1; j < arr.length; j++) {  
		                if(arr[i] == arr[j])  
		                    System.out.println(arr[j]);  
		               			k++;
		                }
		            }  
		        } 
		        if(k==0)
		        {
		        Sysout("UNIQUE ARRAY");
		    }

 */



















