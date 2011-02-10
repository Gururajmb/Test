import junit.framework.TestCase;


public class SumOfPrimeTwoMillionTest extends TestCase {
	public void testShouldreturnSumofPrimeOfTwoMillion(){
	SumPrimeOfTwoMillion sumofPrime = new SumPrimeOfTwoMillion();
	long result = sumofPrime.sumOfPrimeValues();
	assertEquals(37550402,023, result);

	}
}
