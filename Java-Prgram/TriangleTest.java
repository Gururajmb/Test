import junit.framework.TestCase;

public class TriangleTest extends TestCase {
	public void shouldReturnSumOfNumber(){
		Triangle triangle = new Triangle();
		int result = triangle.getSumofNumber();
		System.out.println("result " + result);
		assertEquals(76576500, result);
		
	}

}
