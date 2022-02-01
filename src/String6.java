package stringHandling;

public class String6 {

	public static void main(String[] args) {
		// use of intern() method: which makes the String a part of SCP(String Constant Pool).
		String str1=new String("Hello").intern();//SCP
		String str2="Hello";//String Constant Pool
		System.out.println(str1==str2);//compares the references
		System.out.println(str1.equals(str2));//compares the value/data/state
		
		String str3=new String("Hello").intern();//SCP
		String str4="Hello";
		System.out.println(str2==str4);// true
		System.out.println(str1==str3);// true
		
		String s1=new String("Welcome");
		String s2="Welcome";
		String s3=s1.intern();
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
	}

}
