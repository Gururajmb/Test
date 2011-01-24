
public class Eulers1 {
	public static void main(String[] args) {
		  int sum = 0;
		    int i = 0;
		    while (i < 1000)
		    {
		        if (i%3 == 0 || i%5 == 0) 
		        {
		            sum += i;
		        }
		        i++;
		    }
		    System.out.println("Sum of all natural numbers below one thousand that are multiples of 3 or 5 is:"+sum);
		   		
	}

}

