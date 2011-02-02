import junit.framework.TestCase;

public class SumOfSquaresTest extends TestCase {
	public void testShouldReturnSumOfSquares(){
		SumOfSquares s = new SumOfSquares(100);
		int result = s.methodForgettingSumOfSquares();
		assertEquals(2,result);
	}

	

}
