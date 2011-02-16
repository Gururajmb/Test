import java.math.BigInteger;
 
public class SumOfDigit {
	public int findSum(int n) {
		int sum=0;
		String number=factorial(n).toString();
		for(int i=0;i<number.length();i++)
			sum+=Character.digit(number.charAt(i),10);
		System.out.print(sum);
		return sum;
	}
 	static BigInteger factorial(int i) {
		return i<=1?BigInteger.ONE:BigInteger.valueOf(i).multiply(factorial(i-1));
	}
}