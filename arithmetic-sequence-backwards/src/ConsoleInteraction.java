import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleInteraction {

    private final static int INPUT_SIZE = 3;

    private final int[] input = new int[INPUT_SIZE];

    public int[] getInput() {
        return readInputLineAsIntArray();
    }

    public <T> void showResultInConsole(final List<T> result) {
        System.out.print(result.get(0));
        for (int i = 1; i < result.size(); i++) System.out.print(" " + result.get(i));
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

        if (!checkAdditionalConditions()) throw new InputMismatchException();

        return input;
    }

    private boolean checkAdditionalConditions() {
        return input[0] >= 1 && input[0] <= 100_000 &&
                input[1] >= 1 && input[1] <= 1000 &&
                input[2] >= 1 && input[2] <= 100_000;
    }
}