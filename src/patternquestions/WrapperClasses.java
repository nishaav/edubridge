package patternquestions;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 * 
		 * typecasting
		 * exception handling
		 * array
		 * collection : multiple objects of a class.
		 * Wrapper classes : to convert the primitive datatype into objects of a class.
		 * Integer
		 * Character
		 * Float
		 * Double
		 * Long
		 * Boolean
		 * String
		 * 
		 * Array: homogenous collection of elements
		 * Collection : group of objects of a class.
		 * 
		 * int-->Integer
		 * char-->Character
		 * float-->Float
		 * double-->Double
		 * 
		 * 
		 * String to int
		 * String to float
		 * 
		 * Autoboxing: the process of converting primitive datatypes into object of classes.
		 * Unboxing:the process of converting object of wrapper classes into primitive datatypes.
		 * 
		 * 
		 * 
		 */
		//autoboxing
		int i=10;
		Integer i1=i;//
		Integer i2=Integer.valueOf(i);
		
		
		float f=23.4f;
		Float f1=f;
		Float f2=Float.valueOf(f);
		
		long l=234;
		Long l1=l;
		Long l2=Long.valueOf(l);
		
		double d=1209;
		Double d1=d;
		Double d2=Double.valueOf(d);
		
		
		//unboxing
		Integer i3=189;
		
		int i4=i3;
		
		int i5=i3.intValue();
		
		
		Float f3=786.4f;
		float f4=f3;
		float f5=f3.floatValue();
		
		
		Double d3=8768d;
		double d4=d3;
		double d5=d3.doubleValue();
		
		Long l3=799l;
		long l4=l3;
		long l5=l3.longValue();
		
		
		
		//cross coversion
		
		String str1="2132";
		String str2="4738";
		
		System.out.println(str1+str2);//concatenation
		
		int i6=Integer.parseInt(str1);
		int i7=Integer.parseInt(str2);
		
		System.out.println(i6+i7);
		
		float f6=Float.parseFloat(str1);
		float f7=Float.parseFloat(str2);
		
		System.out.println(f6+f7);
		
		long l6=Long.parseLong(str1);
		long l7=Long.parseLong(str2);
		
		System.out.println(l6+l7);
		
		double d6=Double.parseDouble(str1);
		double d7=Double.parseDouble(str2);
		
		System.out.println(d6+d7);
		
		int i8=0,i9=0;
		try
		{
			String inputString1="demo";
			String inputString2="2318";
		
			i8=Integer.parseInt(inputString1);
			i9=Integer.parseInt(inputString2);
		}
		
		catch(Exception ex)//dynamic method dispatching 
		{
			//System.out.println(e);
			ex.printStackTrace();
		}
		System.out.println("Hello User");
		System.out.println(i8+i9);
		
		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
