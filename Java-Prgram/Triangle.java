public class Triangle {

 
 public int getSumofNumber()  {

    long start = System.currentTimeMillis();
    int num = 1;
    int sum = 0;
    while(true){
      sum += num;
      if(divisors(sum) >= 500){
        System.out.println("It is " + sum);
        break;
      }
      num++;
    }
    long stop = System.currentTimeMillis();
     System.out.println("Time: " + (stop-start) + "ms");
return sum;
  }
  
  public static int divisors(int sum){
    int divisors = 2;
    double root = Math.sqrt(sum);
    for(int i = 2; i <= root ; i++){
      if(sum % i == 0){
        divisors += 2;
      }
    }
    return divisors;
  }
}