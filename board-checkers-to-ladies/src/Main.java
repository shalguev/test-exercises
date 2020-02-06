import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x, y;

        try (final Scanner in = new Scanner(System.in)) {
            x = in.nextInt();
            y = in.nextInt();
        }

        while (y < 8) {
            y++;
        }
    }
}