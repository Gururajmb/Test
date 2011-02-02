
public class SumOfSquares {
	
	int limit;
	public SumOfSquares(int limit){
		limit = this.limit;
	}
	
	int answer = 0;
	public int methodForgettingSumOfSquares(){
		int sum = 0;
		int sumSquare = 0;
		for(int i=0;i<= limit; i++){
			sum = sum +i;
			sumSquare = (sumSquare + i)^2;
			answer = sumSquare-sum;
			
		}
		
		System.out.println("answer==> " + answer);

		return answer;
	}
}
