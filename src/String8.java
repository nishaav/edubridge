package stringHandling;

public class String8 {

	public static void main(String[] args) {
		// StringBuffer
		// ->it is mutable
		//StringBuffer
		
		//Both the classes are same except one difference that StringBuffer is non-synchronized whereas StringBuffer is synchronized
		//Synchronization : when two activities/operations occurs at same time that process is referred as Synchronization
		//Synchronization in java : when multiple threads tries to access the same resource.
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hey!");
		System.out.println(sb);
		sb.append("I am working ");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(20);//to allocate a specific amount of capacity to the instance.
		//new capacity=(old capacity*2)+2;
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.isEmpty());
		System.out.println(sb.indexOf("!"));
		System.out.println(sb.insert(3, " User"));
		System.out.println(sb.charAt(8));
		System.out.println(sb.equals("Hey"));
		System.out.println(sb.indexOf("w", 16));
		System.out.println(sb.lastIndexOf("e"));
		System.out.println(sb.lastIndexOf("e", 7));
		System.out.println(sb.length());
		System.out.println(sb.substring(4, 10));
		System.out.println(sb.reverse());
		sb.trimToSize();
		System.out.println(sb.capacity());
		sb.setCharAt(0, 'h');
		System.out.println(sb);
		
//check whether the string is palindrome or not :(StringBuilder or StringBuffer)
	//anyone can answer	
//-->how many a times a specific character is repeated in the string literal.

	//"Hello User"
	//H->1
	//e->2 
	//l->2
	//o->1
	//U->1
	//s->1
	//r->1	
	// Akshat 6538
	// thirukumaran 6538
	//	
	}
}
