package com;

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		I1 i=new Abcd();
		i.display();
		i.show();
		
		
		Abcd abcd=new Abcd();
		abcd.display();
		abcd.show();
	}

}
//java 7
//interfaces : 
/* -> is another component used to achieve abstraction 100%
 * -> blueprint of a class.
 * ->interface can have only abstract methods and default visibility is public
 *
 * ->java interface also represents IS-A relationship
 * 
 * interface implementation : whenever interfaces will be required to provide the definition, the process of implementing it on a class will be referred as interface implementation
 * 
 *  class extends class
 *  interface extends interface
 *  class implements interface
 *  
 *  implements : to provide definition to the abstract methods of the interface.
 *  
 *  implement multiple interface implementation : (multiple inheritance using interfaces)
 *  JAVA 7 :
 *  interface : 
 *  -> can have abstract methods only.
 *  -> by default methods are public abstract
 *  -> cannot instantiate the interface because interface do not have constructor.
 *  -> it makes the program loosely coupled.
 *  -> interface makes the member variables public ,static and final by default.
 *  
 *  private>default>protected>public
 *  error
 *  :weaker access privilege
 *  
 */

interface I1
{
	void show();//public abstract void show();
	void display();
}


class Abcd implements I1
{
public void show() {
		// TODO Auto-generated method stub
		System.out.println("defined show");
	}

	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("defined display");
	}
	
}





