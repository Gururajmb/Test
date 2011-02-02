public class RangeOfNumbers {
public int getSmallestNumberDivisibleByAllNumberFromOne(int range){
	int divisors[] = [20, 19, 18, 17, 16, 14, 13, 12, 11];
	          int  num_divisors = divisors.size();

	            // We get a speedup by "stepping-up" by the smallest divisor. This also means
	            // that we don't have to test for that divisor

	          int  step = divisors[-1];
	            for (i=step;; i=i+step) {
	               found_all_div = true;
	               for (j=0; j < (num_divisors - 1); j++) {
	                  d = divisors[j];
	                  if (i % d != 0) {
	                     // println ("${i} is not divisible by ${d} ...")
	                     found_all_div = false;
	                     break;
	                  }
	               }
	               
	               if (found_all_div) {
System.out.println(i);	                  // => 232792560
	                  break;
	               }
	            }

}

}