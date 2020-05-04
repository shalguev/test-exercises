import java.util.*;

class Main {
  public static void main(String[] args) {
    int n = 0;
    final Set<Integer> userIds = new HashSet<>();

    try (final Scanner in = new Scanner(System.in)) {
      n = in.nextInt();
      for (int i = 1; i <= n-2; i++) {
        userIds.add(in.nextInt());
      }
    }
    
    for (int i = 1; i <= n; i++) {
      if (!userIds.contains(i)) System.out.println(i + " ");
    }
  }
}
