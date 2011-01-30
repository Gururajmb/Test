import junit.framework.TestCase;
import org.junit.Test;


public class LargestPalindromeTest extends TestCase{


    @Test
    public void testfindingLargestPalindrome(){
        assertEquals(906609, new LargestPalindromeRange(1000,100).largestPalindromeFinder());
    }

}