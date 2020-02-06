import java.time.Month;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int numberOfMonth;

        try (final Scanner in = new Scanner(System.in)) {
            numberOfMonth = in.nextInt();
        }

        if (numberOfMonth >= 1 && numberOfMonth <= 12) {
            System.out.println(Month.of(numberOfMonth).length(false));
        } else System.out.println("oh my god danila are you crazy");
    }
}