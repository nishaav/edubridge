package collections;
import java.util.*;
public class Collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=scanner.nextInt();
		System.out.println("Enter "+size+" elements: ");
		ArrayList<Integer> al= new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			al.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println("Elements in list: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		al.remove(3);
		al.remove(Integer.valueOf(10));
		al.set(0,12);
		System.out.println("Elements in list after update: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}
