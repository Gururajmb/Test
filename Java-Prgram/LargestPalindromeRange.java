public class LargestPalindromeRange {
	
	int highestRange,lowestRange;
	public LargestPalindromeRange(int highestRange,int lowestRange){
	       this.highestRange=highestRange;
	       this.lowestRange=lowestRange;
	    }
	

    public int largestPalindromeFinder() {

        char[] cNum;
        String sNum;
        int answer = 0;
        int valueinInt;

        for (int x = lowestRange; x < highestRange; x++) {
            for (int y = lowestRange; y < highestRange; y++) {
                cNum = Integer.toString(x * y).toCharArray();
                if (cNum[0] == cNum[cNum.length - 1]
                        & cNum[1] == cNum[cNum.length - 2]
                        & cNum[2] == cNum[cNum.length - 3]) {
                    sNum = new String(cNum);
                    valueinInt = Integer.parseInt(sNum);
                    if (valueinInt > answer) {
                        answer = valueinInt;
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

}