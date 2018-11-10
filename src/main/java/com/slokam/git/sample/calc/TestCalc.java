package com.slokam.git.sample.calc;

import org.junit.Assert;
import org.junit.Test;

public class TestCalc {

	@Test
	public void test() {
	
	int a=2;
	int b=3;
	int expected=5;
	Calculation calc=new Calculation();
	int actual=calc.calc(a,b);
	Assert.assertEquals(expected, actual);
	}
}
