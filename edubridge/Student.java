package com.edubridge;

public class Student {

	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.b=12;
		System.out.println(d1.b);
		d1.display();
		System.out.println("Protected Member c in Student : "+d1.c);
	}
	
}

/*
 * private members :
 * within the class only
 */
/*
 * default members :
 * within the class
 * outside the class within the program
 * outside the class in another program within same package.
 */

/*
 * protected members :
 * within the class
 * outside the class within the program
 * outside the class in another program within same package.
 * outside the class in another packages(inheritance needs to be performed)
 * 
 */

/*
 * public members :
 * within the class
 * outside the class within the program
 * outside the class in another program within same package.
 * outside the class in another packages.
 * 
 */

/*
 * Maven : 

Maven is a powerful project management tool.
it is based on POM.xml(Project Object Model).

build, and add dependency and document your project.

Automates the build process.

benefits :
1)it makes project build easy.
2)it provides a uniform build process.
3)it provides project information in POM.xml.
(dependency list,name of project,and structural information).
 * 
 * 
 * Core project: 
 * Archetype : maven-archetype-quickstart
 * Group Id : org.apache.maven.archetypes
 * 
 * WebApp project:
 * Archetype : maven-archetype-webapp
 * Group Id : org.apache.maven.archetypes
 * 
 * Artifact : Project Name
 * groupid :package part
 * 
 * Package: groupid+artifactid
 * 
 * 
 * domain name/website url : capgemini.com
 * 
 * package : com.capgemini
 * 
 * edubridgeindia.com
 * 
 * package : com.edubridgeindia
 * 
 * url : softech.com
 * 
 * package: com.softech
 * 
 * 
 * 
 * 
 * 
 */
