class SlowRecursiveFib {
  public static void main(String[] args) {
    System.out.println(fib(50));
  }

  private static long fib(final long n) {
    if(n <= 2){
      return 1L;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }
}
