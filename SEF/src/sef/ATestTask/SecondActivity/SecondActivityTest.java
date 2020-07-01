package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import sef.ATestTask.SecondActivity.SecondActivity.Calculator;

import org.junit.Test;

public class SecondActivityTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private Calculator theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity(). new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15D, (theCalculator.sum(5, 10)));
		assertEquals(15D, (theCalculator.sum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5.0, (theCalculator.sum(-5, 10)));
		assertEquals(-5.0, (theCalculator.sum(5, -10)));
	}

	@Test
	public void testGetMinPositiveValue() {
		assertEquals(-5D, (theCalculator.minus(5, 10)));
		assertEquals(5D, (theCalculator.minus(10, 5)));
	}
	
	@Test
	public void testGetDivPositiveValue() {
		assertEquals(0.5D, (theCalculator.divide(5, 10)));
		assertEquals(2D, (theCalculator.divide(10, 5)));
	}
	
	@Test
	public void testGetMulPositiveValue() {
		assertEquals(50D, (theCalculator.multiply(5, 10)));
		assertEquals(50D, (theCalculator.multiply(10, 5)));
	}
	
}

