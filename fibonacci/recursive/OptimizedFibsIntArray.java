import java.util.*;

class Solution {
    public int solve(int n) {
        return fib(n)[1];
    }
    
    private int[] fib(final int n) {
        if (n < 3) return new int[]{1, 1};
        final int[] fibs = fib(n-1);
        return new int[]{fibs[1], fibs[0]+fibs[1]};
    }
}
