
public class PrimeNumber

{

       public static boolean isPrime(int startValue)

       {

              if (startValue == 1) return false;

              boolean isPrime=true;

              for (int i = 2; i < startValue; i++)

                     if ((startValue != i) && (startValue % i == 0))

                     {

                            isPrime = false;

                            break;

                     }

              if (isPrime == true) return true;

              else return false;

       }

       public int getPrimeValue()

       {

              int counter = 0;

              int i = 2;
              int limit = 10001;

              while(counter < limit)

              {

                     if (isPrime(i))

                            counter++;

                     i++;

              }

              i--; 

              System.out.println(i);
			return i;

       }
}