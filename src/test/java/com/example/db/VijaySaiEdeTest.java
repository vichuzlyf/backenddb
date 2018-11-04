package com.example.db;

import org.junit.Test;

import com.example.batch22a.VijayaSaiE;

import junit.framework.Assert;

public class VijaySaiEdeTest {
	VijayaSaiE v=new VijayaSaiE();
	@Test
	public void additionTest() {
		
		int a=2;
		int b=4;
		int expectedVal=6;
		
		//int actualValue=a+b;
		int actualValue = v.Addition(a, b);
		Assert.assertEquals(actualValue, expectedVal);
		
	
		
	}

}
