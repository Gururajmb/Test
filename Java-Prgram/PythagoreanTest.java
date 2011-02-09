import junit.framework.TestCase;
public class PythagoreanTest extends TestCase {
	public void testShouldReturnProduct(){
		Pythagorean p = new Pythagorean();
		int result = p.getProductOftriplet();
		assertEquals(25,result);/*should return 31875000 */
	}

	

}