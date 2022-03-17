package multithreading;

public class DecisionMaking {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * decision making constructs
		 * 
		 * simple if()
		 * if else
		 * if else if
		 * nested if
		 * switch case
		 * 
		 * 
		 * 
		 * evenOdd->1 output
		 * 2 output
		 * 
		 * 
		 */
		
		int num=10;
		//simple if
		
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		
		//if - else
		if(num%2==0 )
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		//if - else - if : when multiple conditions to be judged on the basis of satisfaction,different outputs to be generated.
		/*
		 * per 90-100 A
		 *     80-90 B
		 *     70-80 C
		 *     60-70 D
		 *     
		 * 
		 * 
		 */
		
		double per=89;
		if((per>=90)&&(per<=100))
		{
			System.out.println("A Grade");
		}
		else if((per>=80)&&(per<90))
		{
			System.out.println("B Grade");
		}
		else if((per>=70)&&(per<80))
		{
			System.out.println("C Grade");
		}
		else if((per>=60)&&(per<70))
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("E Grade");
		}
		
		
		//nested if
		// if inside another if 
		//ATM : Insert card
		//pin
		//transaction type
		//withdraw
		//demand the amount
		//validated
		//transaction successful
		long cardNo=2121;
		if(cardNo==2121)
		{
			int pin=1234;
			if(pin==1234)
			{
				String txntype="withdraw";
				if(txntype=="withdraw")
				{
					
				}
			}
		}
		
		//switch is used to reduce the complexity
		int choice=3;
		switch(choice)
		{
		case 1: System.out.println("Choice is 1");
					break;
		case 2: System.out.println("choice is 2");
					break;
		default: System.out.println("Invalid choice");			
		}
		
		int n=10;
		float f=n;
		float f1=90.5f;
		int n1=(int)f1;
		
		
		//Narrowing type casting->collapsing/squeezing
		//float f1=90.5f;
		//int n1=(int)f1;
		//double-->float-->long-->int-->short-->byte
		byte b=1;
		short s=b;
		
		
		//widening type casting->expanding
		//byte-->short-->int-->long-->float-->double
		//int n=10;
		//float f=n;
		//
		//Association
		//Concurrency
		//SQL +core java doubts
		
		
	}

}
