package com.example.db;

import org.junit.Test;

import junit.framework.Assert;

public class AddTest {
	@Test
	public void add()
	{
		int a=10,b=20;
		int expected=30;
		Add a1=new Add();
		int actual=a1.addition(a, b);
		Assert.assertEquals(expected, actual);
		
	}

}
