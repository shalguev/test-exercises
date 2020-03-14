import java.math.*;

class OptimizedFibs {
  public static void main(String[] args) {
    System.out.println(fib(501)[1]); // fibs from 1st: 1st == 2nd == 1;
  }

  private static BigInteger[] fib(final int n) {
    if(n <= 1){
      return new BigInteger[]{BigInteger.valueOf(0), BigInteger.valueOf(1)};
    } else {
      final BigInteger[] fibPair = fib(n - 1);
      return new BigInteger[]{fibPair[1], fibPair[0].add(fibPair[1])};
    }
  }
}
