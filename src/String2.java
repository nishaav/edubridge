package stringHandling;

public class String2 {

	public static void main(String[] args) {
		String str1="EduBridge";
	      int first=str1.indexOf('1');
	      String newstr=str1.substring(0,first+1);
	      String newstr1=str1.substring(first+1,str1.length().replaceFirst("d","a"));
	      System.out.println(newstr+newstr1);


	}

}
