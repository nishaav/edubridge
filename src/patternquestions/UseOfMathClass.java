package patternquestions;

public class UseOfMathClass {

	public static void main(String[] args) {
		double num1=42;
		double num2=21;
		
		double num3=841;
		System.out.println("Max of "+num1+" and "+num2+" : "+Math.max(num1, num2));
		System.out.println("Min of "+num1+" and "+num2+" : "+Math.min(num1, num2));
		System.out.println("Square root : "+Math.sqrt(num3));
		System.out.println("2 Power 4 : "+Math.pow(4,2));
		System.out.println("Ceil Value : "+Math.ceil(87.4));
		System.out.println("Floor value  : "+Math.floor(87.6));
		System.out.println("Exponential : "+Math.exp(4));//based on Euler's formula.. e raised to the power of double value.
		System.out.println("Absolute Value  : "+Math.abs(-45));
		

	}

}
