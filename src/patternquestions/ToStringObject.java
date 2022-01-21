package patternquestions;

public class ToStringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=new String("Hello");
		System.out.println(str);
		Share share=new Share("Hello");
		System.out.println(share);
	}

}
class Share extends ToStringObject
{
	String str;
	Share(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}