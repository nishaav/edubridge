package com.edubridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

//Suite class will enable us to execute all the test case classes together
@Suite.SuiteClasses
({
	CalculatorTest.class,TestCases.class
})
public class TestExecution {
	
//	@Test
//	public void show()
//	{
//		System.out.println("hello");
//	}
//	
}
