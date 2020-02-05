import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final ConsoleInteraction ci = new ConsoleInteraction();

        final Rectangle rect;

        try {
            rect = new Rectangle(ci.getNM());
        } catch (InputMismatchException | NumberFormatException e) {return;}

        ci.showResultInConsole(rect.fillRectangleAsLenaDid());
    }
}

class ConsoleInteraction {

    private final static int INPUT_SIZE = 2;

    private final int[] input = new int[INPUT_SIZE];

    public int[] getNM() {
        return readInputLineAsIntArray();
    }

    public void showResultInConsole(final String[][] rect) {
        for (int i = 0; i < input[0]; i++) {
            for (int j = 0; j < input[1]; j++) System.out.print(rect[i][j]);
            if (i < input[0] - 1) System.out.println();
        }
    }

    private int[] readInputLineAsIntArray() {
        final Scanner sc = new Scanner(System.in);
        String[] inputLine = sc.nextLine().split(" ");
        sc.close();

        int i = 0;
        if (inputLine.length == INPUT_SIZE) while (i < INPUT_SIZE) {
            input[i] = Integer.parseInt(inputLine[i]);
            i++;
        } else throw new InputMismatchException();

        if (!(input[0] >= 0 && input[1] >= 0 &&
                input[0] <= 30 && input[1] <= 30)) throw new InputMismatchException();

        return input;
    }
}

class Rectangle {

    private final String[][] rect;

    private final int[] nm;

    public Rectangle(final int[] nm) {
        this.nm = nm;
        this.rect = new String[nm[0]][nm[1]];
    }

    public String[][] fillRectangleAsLenaDid() {
        int number = 0;
        int j = 0;
        int nxm = nm[0] * nm[1];
        for (int i = 0; i < nm[0]; i++) {
            if (number > nxm) break;

            if (i % 2 == 0) for (j = 0; j < nm[1]; j++) rect[i][j] = addSpaces(number++);

            if (i % 2 > 0) for (j = nm[1] - 1; j >= 0; j--) rect[i][j] = addSpaces(number++);
        }
        return rect;
    }

    private static String addSpaces(final int i) {
        if (i < 10) return "  " + i;
        if (i < 100) return " " + i;
        return "" + i;
    }
}