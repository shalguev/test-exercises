import java.util.*;
import static java.lang.Math.abs;

class Main {
  public static void main(String[] args) {
    int n = 0;
    String input;
    int tempSum = Integer.MAX_VALUE;
    int closestSum = Integer.MAX_VALUE;

    try (final Scanner in = new Scanner(System.in)) {
      n = Integer.parseInt(in.nextLine());
      input = in.nextLine();
    }
    
    final String[] nums = input.split(" ");
    final int[] points = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      points[i] = Integer.parseInt(nums[i]);
    }

    Arrays.parallelSort(points);
    int j = 0, k = points.length - 1;
    for (int i = 0; i < points.length; i++) {
      j = i + 1;
      while (j < k) {
        tempSum = points[i] + points[j] + points[k];
        if (abs(n - tempSum) < abs(n - closestSum)) {
          closestSum = tempSum;
        }
        if (tempSum > n) {
          k -= 1;
        } else j += 1;
      }
    }

    System.out.println(closestSum);
  }
}
