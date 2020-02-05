import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ConsoleInteraction ci = new ConsoleInteraction();

        int[] input;

        try {
            input = ci.getInput();
        } catch (InputMismatchException | NumberFormatException e) {return;}

        int a = input[0]; // A - result array last number
        int x = input[1]; // X - difference between 2 adjacent numbers
        int n = input[2]; // N - number of elements in the output array

        List<Integer> result = new ArrayList<>(n);
        result.add(a);

        for (int i = n-1; i > 0; i--) {
            result.add(0, result.get(0) + x);
        }

        ci.showResultInConsole(result);
    }
}
