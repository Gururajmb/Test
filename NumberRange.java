
public class NumberRange {
    private int limit;
	public NumberRange(int limit) {

        this.limit = limit;
    }
	
	public int sumOfMultiplesOf(int x,int y) {
		  int sum = 0;
		    int i = 0;
		    
		    while (i < 1000)
		    {
		        if (i%x == 0 || i%y == 0) 
		        {
		        	sum += i;
		        }
		        i++;
		    }
		    
return sum;		       		
	}

}
