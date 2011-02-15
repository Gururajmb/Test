public class LetterCount {
	final int AND=3,HUNDRED=7;
	//	{one,two,...,nine},{ten,eleven,...,nineteen},{twenty,thirty,...,ninety}
	int a[][]={{3,3,5,4,4,3,5,5,4},{3,6,6,8,8,7,7,9,8,8},{6,6,5,5,5,7,6,6}};
	int sum="onethousand".length(),tmp;

	public LetterCount() {
		for(int i:a[1]) 
			sum+=i;	// [ten-nineteen]
		for(int i:a[2]) {
			sum+=(tmp=i); // [twenty-ninety]
			for(int j:a[0])
				sum+=tmp+j; // [twenty-ninety][one-nine]
		}
		for(int i:a[0]) {
			sum+=i+(tmp=i+HUNDRED); // [one-nine] & [one-nine]hundred
			for(int j:a[0])
				sum+=tmp+AND+j; // [one-nine]hundredand[one-nine]
			for(int j:a[1])
				sum+=tmp+AND+j; // [one-nine]hundredand[ten-nineteen]
			for(int j:a[2]) {
				sum+=tmp+AND+j; // [one-nine]hundredand[twenty-ninety]
				for(int k:a[0])
					sum+=tmp+AND+j+k; // [one-nine]hundredand[twenty-ninety][one-nine]
			}
		}
	}

	public int getSum() {
		return this.sum;
	}

	public int getCount() {
		int count = 0;
		count = new LetterCount().getSum();
		System.out.println(count);
		return count;
	}
}