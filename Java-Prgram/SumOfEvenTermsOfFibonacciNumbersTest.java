import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class SumOfEvenTermsOfFibonacciNumbersTest {

    @Test
    public void SumOfEvenTermsOfFibonacciNumbersStartFromTest(){

        assertEquals(4613732, new SomeEvenFibinocciNumbers(1,2).sumOfEvenTermsOfFibonacciNumbersUpTo(4000000));
        
    }
}