package com.sandeep.Testing;

import org.junit.Assert;
import org.junit.Test;

public class JunitTestCasr {

	@Test
	public void Addtest() {
		int a = 20;
		int b = 30;
		int expected = 50;
		
		BODMAS BD = new BODMAS();
		int actual = BD.Add(a, b);
		
		Assert.assertEquals(expected, actual);
				
	}
	
}
