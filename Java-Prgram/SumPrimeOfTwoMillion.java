public class SumPrimeOfTwoMillion{
	public long sumOfPrimeValues(){
		int i, number;
		long sum = 2 + 3;
		boolean itsAprime;

		for ( number = 5; number < 1000000; number += 2 ){
			itsAprime = true;
			for ( i = 3; i <= Math.sqrt(number); i += 2 )
				if ( number % i == 0 ){
					itsAprime = false;
					i = number;
				}
			if ( itsAprime )
				sum += number;
		}
		System.out.println("\n" + sum);
	return sum;
	}
} 