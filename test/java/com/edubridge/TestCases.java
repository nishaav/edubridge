package com.edubridge;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestCases {

@Test
public void testValue()
{
	//String str="calculator";
	//String str1="calculator";
	
	Calculator calc=new Calculator();
	Calculator calc1=new Calculator();
	assertSame(calc,calc1);//assertSame checks the object references
}

@Test
public void testValue1()
{
	String str=new String("calculator");
	String str1=new String("calculator");
	
	assertSame(str,str1);
}

@Test 
public void array1()
{
	String ar[]= {"A","B","C"};
	String ar1[]= {"a","b","c"};
	assertArrayEquals(ar,ar1);
	
}


String str="";
@Test 
public void check()
{
	//assertNull(str);
	assertNotNull(str);
}
}
