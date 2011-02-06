import junit.framework.TestCase;

import junit.framework.TestCase;

public class PrimeTest extends TestCase {
	public void testShouldReturnPrimeValue(){
		PrimeNumber s = new PrimeNumber();
		int result = s.getPrimeValue();
		assertEquals(10474,result);
	}

	

}