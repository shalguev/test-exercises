import java.util.*;

class Main {
  public static void main(String[] args) {
    int m = 0;
    final List<String> matrixLines = new ArrayList<>();
    try (final Scanner in = new Scanner(System.in)) {
      m = Integer.parseInt(in.nextLine());
      for (int i = 0; i < m; i++) {
        matrixLines.add(in.nextLine());
      }
    }

    final int[][] matrix = new int[m][m];
    for (int i = 0; i < m; i++) {
      final String[] matrixLine = matrixLines.get(i).split(" ");
      for (int j = 0; j < m; j++) {
        matrix[i][j] = Integer.parseInt(matrixLine[j]);
      }
    }

    int i = m/2;
    int j = m/2;
    int size = 2;
    System.out.println(matrix[i][j]);

    while (i != 0 || j != 0) {
      i -= 1;
      for (int max = j + size; j < max; j++) {
        System.out.println(matrix[i][j]);
      }
      j -= 1;
      
      i += 1;
      for (int max = i + size; i < max; i++) {
        System.out.println(matrix[i][j]);
      }
      i -= 1;

      j -= 1;
      for (int min = j - size; j > min; j--) {
        System.out.println(matrix[i][j]);
      }
      j += 1;

      i -= 1;
      for (int min = i - size; i > min; i--) {
        System.out.println(matrix[i][j]);
      }
      i += 1;

      size += 2;
    }
  }
}
