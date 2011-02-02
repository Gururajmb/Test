
public class NumberRangeClass {
	
	NumberRangeClass(){
		int limit = 1000;
	}
public int	methodToGetSumofValues(int x,int y){
	int sum = 0;
	int i =0;
	while(i<1000){
		if(x/i ==0 || y/i==0){
			sum = sum +i;
		}
		i++;
		
	}
	
	return sum;
}

}
