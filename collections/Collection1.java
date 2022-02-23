package collections;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Autoboxing : 
		int a=10;
		Integer i=a;
		Integer i1=Integer.valueOf(a);
		float f=90.67f;
		Float f1=f;
		Float f2=Float.valueOf(f);
		
		double d=878;
		Double d1=d;
		Double d2=Double.valueOf(d);
		
		long l=1098;
		Long l1=l;
		Long l2=Long.valueOf(l);
		
		String str="fhj";
		str.length();
//Unboxing :
		int in=i;
		int in1=i.intValue();
		
		float fn1=f1;
		float fn2=f1.floatValue();
		
		double dn1=d1;
		double dn2=d1.doubleValue();
		
		long ln1=l1;
		long ln2=l1.longValue();
		
// cross casting		
	//Unboxing
		String str1="123";
		String str2="56";
		System.out.println(str1+str2);//12356
		
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		System.out.println(num1+num2);
		
		float num3=Float.parseFloat(str1);
		float num4=Float.parseFloat(str2);
		
		System.out.println(num3+num4);
		double num5=Double.parseDouble(str1);
		double num6=Double.parseDouble(str2);
		
		System.out.println(num5+num6);
		long num7=Long.parseLong(str1);
		long num8=Long.parseLong(str2);
		
		System.out.println(num7+num8);
		
		//Autoboxing
	String inputString=String.valueOf(num1);	
		
		
		
	}

}
/*
 *Collections : 
 *->framework :
 *to store and manipulate group of objects of a class.
 *
 *Wrapper classes:
 *int->Integer
 *char->Character
 *float->Float
 *double->Double
 *long->Long
 *boolean->Boolean
 *String
 *
 *wrapper classes provides the functionality to convert primitive datatypes into
 *objects and vice-a-versa
 *
 *
 *Autoboxing : the process of conversion of primitive datatype to object.
 *Unboxing: the process of conversion of object into primitive datatype.
 *
 *
 */