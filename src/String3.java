package stringHandling;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to replace the second occurence of a character
		String str="edubridgeLearning";
		System.out.println(str);
		int index=str.indexOf("e");
		System.out.println(index);
		String str1=str.substring(index+1,str.length());
		System.out.println(str1);
		System.out.println(str1.replaceFirst("e", "A"));
		//if you have to remove all occurences except the first
		System.out.println(str1.replaceAll("e", "A"));

	}

}
/*
 * String is immutable
 * Immutable:unmodifiable or unchangeable
 * 
 * once the string is created and we are doing some changes in the string state/data., then a new instance will get created.
 * 
 * String class is final.What will be the affect?
 * ->1)We cannot inherit the final class because of which overriding the methods of String class is not possible.
 *  
 */
