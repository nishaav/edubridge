package com;

import entity.Learner;

public class Encapsulation {

	public static void main(String[] args) {
		/*
		 * Encapsulation : the process of wrapping of functionality and state(data) into a single unit to achieve data hiding.
		 * ->all the member variables are private
		 * ->by using setters and getters.
		 * ->encapsulated class : class designed by the rules of encapsulation is referred as the encapsulated class.
		 * ->read only or write only classes.
		 * ->E.g. BEAN class.
		 * ->seperate and a part of the package
		 * 
		 * 
		 * reusability
		 * security
		 * hiding the implementation
		 * lightweighted
		 * easy to test
		 * easily updatable
		 * loosely coupled
		 * 
		 * No import statement is required if the class is a part of same package.
		 * import statement is required if the class is a part of different package.
		 * 
		 * 
		 * unit testing 
		 */

		Learner learner=new Learner();
		learner.setEnrolmentNo(12);
		learner.setEnrolmentName("Priya");
		
		System.out.println(learner.getEnrolmentNo()+" "+learner.getEnrolmentName());
		
	}

}