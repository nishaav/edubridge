package collections;
import java.util.*;
/*
 * 
 * Create a user defined class which should have the structure 
 * 1)id
 * 2)name
 * 3)percentage of 10th 
 * 4)percentage of 12th.
 * 
 * take an average of 10th and 12th percentage 
 * 90 80 : 85
 * 
 * sort the collection in descending order on the basis average percentage of 10th and 12th.
 * can use comparable or comparator as your choice. 
 */ 
public class Collection20 {

	public static void main(String[] args) {
		
		ArrayList<Learner> al=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the details of the candidate : ");
		char ch='Y';
		int id;
		String name;
		double tenth,twelveth,avg;
		while(ch=='y' || ch=='Y')
		{
			System.out.println("Enter the id : ");
			id=scan.nextInt();
			System.out.println("Enter the name : ");
			name=scan.next();
			System.out.println("Enter the percentage of 10th standard : ");
			tenth=scan.nextDouble();
			System.out.println("Enter the percentage of 12th standard : ");
			twelveth=scan.nextDouble();
			avg=(tenth+twelveth)/2;
			Learner learner=new Learner(id,name,tenth,twelveth,avg);
			al.add(learner);
			System.out.println("Do you want to add more candidates");
			System.out.println("Press Y for Yes and N for No");
			ch=scan.next().charAt(0);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		int position=1;
		for(int i=0;i<al.size()-1;i++)
		{
			if(al.get(i).average>al.get(i+1).average)
			{
				//al.get(i).position=position;
				System.out.println(al.get(i).name+" "+position);
				
				position++;
				System.out.println(al.get(i+1).name+" "+position);
			}
			else if(al.get(i).average==al.get(i+1).average)
			{
				//al.get(i).position=position;
				System.out.println(al.get(i).name+" "+position);
				System.out.println(al.get(i+1).name+" "+position);
			}
			else
			{
				//System.out.println(al.get(i+1).name+" "+position);
			}
		}
		
		
		scan.close();
		//allocate grades to the candidates
		/*
		 * highest Ist position
		 */
		
	}

}
class Learner implements Comparable<Learner>
{
	int id;
	String name;
	double tenth;
	double twelveth;
	double average;
	
	
	
	public Learner(int id, String name, double tenth, double twelveth, double average) {
		super();
		this.id = id;
		this.name = name;
		this.tenth = tenth;
		this.twelveth = twelveth;
		this.average = average;
	}
	@Override
	public int compareTo(Learner learner) {
		// TODO Auto-generated method stub
		
		if(average==learner.average)
		{
			return 0;//no change in the index
		}
		else if(average<learner.average)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public String toString()
	{
		return id+" "+name+" "+tenth+" "+twelveth+" "+average;
	}
}
