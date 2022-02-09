package nestedClasses;

public class NestedClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car()
		{
			public void fuel()
			{
				System.out.println("Car fuel");
			}
			public void mileage()
			{
				System.out.println("Car mileage");
			}
			public void price()
			{
				System.out.println("Car price");
			}
			
		};
		c.fuel();
		c.mileage();
		c.price();
		
		Car car=new Car() //Anonymous class
				{
					
					@Override
					public void price() 
					{
						System.out.println("Car price 5lak");
					}
					
					@Override
					public void mileage() 
					{
						System.out.println("300Km");
					}
					
					@Override
					public void fuel() 
					{
						System.out.println("5lit");
					}
				};
				car.price();
				car.fuel();
				car.mileage();
				
				Car car1=new Car() 
				{
					
					@Override
					public void price() 
					{
						System.out.println("Car price 10lak");

					}
					
					@Override
					public void mileage() 
					{
						System.out.println("400Km");
					}
					
					@Override
					public void fuel() 
					{
						System.out.println("5lit");
					}
				};
				car1.price();
				car1.mileage();
				car1.fuel();
				/*
				 * compiler is providing the name to the anonymous class
				 * object of anonymous class is created for which we are creating the reference variable.
				 * 
				 */
			

	}

	

}

interface Car
{
	void fuel();
	void mileage();
	void price();
}

//anonymous class