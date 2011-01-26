
public class SomeEvenFibinocciNumbers {

    int Number1;
    int Number2;

    SomeEvenFibinocciNumbers(int numb1, int numb2){

      this.Number1 = numb1;
      this.Number2 = numb2;

    }

    public int sumOfEvenTermsOfFibonacciNumbersUpTo(int fibonacciTermsUpTo){

        int sumOfEvenTermsOfFibonacciTerms = 0;

        if(Number1%2 == 0){
            sumOfEvenTermsOfFibonacciTerms += Number1;
        }

        int Temp;

        while(Number2 <= fibonacciTermsUpTo){

            if(Number2%2 == 0){
                sumOfEvenTermsOfFibonacciTerms += Number2;
            }

            Temp = Number1;
            Number1 = Number2;
            Number2 += Temp;
        }

        return sumOfEvenTermsOfFibonacciTerms;

    }
}