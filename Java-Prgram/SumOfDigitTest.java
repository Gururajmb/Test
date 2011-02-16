import junit.framework.TestCase;


public class SumOfDigitTest extends TestCase{
	public void shouldReturnSumOfValues(){
		assertEquals(648, new SumOfDigit().findSum(100));
	}

}
