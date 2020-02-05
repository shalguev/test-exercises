import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInteraction {

    private final static int NUMBER_OF_INTERVALS = 1000_000;
    private final static int MAX_LR = 1000_000_000;
    private final static int MIN_LR = -1000_000_000;

    final Scanner sc = new Scanner(System.in);

    public int[][] getArrLR() {
        return this.readAndCheckRows(getN());
    }

    private int getN() {
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0 && n <= NUMBER_OF_INTERVALS) {
            return n;
        } else return -1;
    }

    private int[][] readAndCheckRows(final int arrLength) {
        final int[][] result = new int[arrLength][2];

        for (int i = 0; i < arrLength; i++) {
            String[] nextLine = sc.nextLine().split(" ");
            if (nextLine.length > 2) throw new InputMismatchException();

            result[i][0] = Integer.parseInt(nextLine[0]);
            if (result[i][0] < MIN_LR || result[i][0] > MAX_LR) throw new InputMismatchException();

            result[i][1] = Integer.parseInt(nextLine[1]);
            if (result[i][1] < MIN_LR || result[i][1] > MAX_LR) throw new InputMismatchException();

            if (result[i][0] > result[i][1]) throw new InputMismatchException();
        }

        return result;
    }
}