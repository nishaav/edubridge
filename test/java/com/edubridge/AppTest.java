package com.edubridge;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
//    /**
//     * Rigorous Test :-)
//     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
	
//	public static void main(String args[])
//	{
//		Result result = JUnitCore.runClasses(CalculatorTest.class,TestCases.class);
//		
//        for (Failure failure : result.getFailures()) 
//        {
//           System.out.println(failure.toString());
//        }
//        System.out.println(result.getRunCount());
//        System.out.println(result.getFailureCount()); 
//        System.out.println(result.getIgnoreCount());
//        System.out.println(result.wasSuccessful());//true if all test cases were passed.
//        
//	}
	
	public static void main(String args[])
	{
		Result result = JUnitCore.runClasses(TestExecution.class);
		
        for (Failure failure : result.getFailures()) 
        {
           System.out.println(failure.toString());
        }
        System.out.println(result.getRunCount());
        System.out.println(result.getFailureCount()); 
        System.out.println(result.getIgnoreCount());
        System.out.println(result.wasSuccessful());//true if all test cases were passed.
        
	}
	
}
