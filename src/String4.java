package stringHandling;

import java.util.StringTokenizer;

public class String4 {

	public static void main(String[] args) {
		//split(): splits on the basis of exact delimiter match
		String str1="Hey! I amworking with Stringsplit!method";
		String[] ar=str1.split("! ");//word,symbol,specific character
		System.out.println("Using split method : ");
		for(String s:ar)
		{
			System.out.println(s);
		}

		//StringTokenizer class : splits on the basis of multiple delimiter matches
		System.out.println("Using StringTokenizer Class : ");
		StringTokenizer st=new StringTokenizer(str1,"! ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
