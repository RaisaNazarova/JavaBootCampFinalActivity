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
		assertEquals(15, (theCalculator.sum(5, 10)));
		assertEquals(15, (theCalculator.sum(10, 5)));
	}

	//Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, (theCalculator.sum(-5, 10)));
		assertEquals(-5, (theCalculator.sum(5, -10)));
	}

}

