import java.util.logging.Logger;

public class CompositNumber {

    long compositNumber;

    public CompositNumber(long compositNumber){

        this.compositNumber = compositNumber;
    }

    public CompositNumber largestPrimeFactor(){

        if (compositNumber < 1){
            System.out.println("Invalid value");
            return null;
        }

        long largestPrimeFactor = 1;
        int i = 2;

        while(i <= compositNumber){
            if(compositNumber % i == 0){
                compositNumber = compositNumber / i;
                largestPrimeFactor = i;
            }else{
                i++;
            }
        }

        return new CompositNumber(largestPrimeFactor);
    }

    public long longValue(){
        return compositNumber;
    }
}