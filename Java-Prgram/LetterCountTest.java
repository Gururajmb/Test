import junit.framework.TestCase;
public class LetterCountTest extends TestCase{
	public void shouldReturnLetterCount(){
		assertEquals(21124, new LetterCount().getCount());
	}
}
