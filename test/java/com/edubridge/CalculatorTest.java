package com.edubridge;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class CalculatorTest {

	int a;
	 Calculator calculator;
/*
 * 
 * 
 * 	
 */
@BeforeClass	
public static void execute()
{
	System.out.println("Test case execution begins!!");
}

/*
 * 
 */
@AfterClass	
public static void execute1()
{
	System.out.println("Test case execution ends!!");
}	
@Before
public void myMethod()
{
	System.out.println("Test case begins");
}
@After
public void myMethod1()
{
	System.out.println("Test case ends");
}

@Test	
public void testGradeCalculator()
{
	calculator=new Calculator();
	char result=calculator.gradeCalculator(120);
	assertEquals('F',result);
}
@Ignore
@Test	
public void testGradeCalculator1()
{
	calculator=new Calculator();
	char result=calculator.gradeCalculator(80);
	assertEquals('B',result);
}

@Test
public void testEligibility()
{
	a=10;
	calculator=new Calculator();//initializing the reference variable with an object
	String output=calculator.checkEligibility(90);
	assertEquals("Eligible ",output);
	System.out.println(a);//
}

@Ignore//ignores the test case and will not execute.
@Test
public void testEligibility1()
{
	calculator=new Calculator();
	String output=calculator.checkEligibility(56);
	assertEquals("Not Eligible",output);
}

@Test//annotation guiding JVM about which test case should run
public void testEligibility2()
{
	calculator=new Calculator();
	String output=calculator.checkEligibility(110);
	assertEquals("Invalid",output);
}

@Test
public void testEvenOdd()
{
	calculator=new Calculator();
	boolean result=calculator.evenOdd(90);
	assertTrue(result);
}


@Test
public void testEvenOdd1()
{
	calculator=new Calculator();
	boolean result=calculator.evenOdd(97);
	assertFalse(result);
}


@Test
public void testEvenOdd2()
{
	calculator=new Calculator();
	boolean result=calculator.evenOdd(94);
	assertFalse(result);
}



}
