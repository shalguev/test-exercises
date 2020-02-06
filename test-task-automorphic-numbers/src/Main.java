import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long a, b, d = 1;
        boolean success = false;

        try (final Scanner in = new Scanner(System.in)) {
            a = in.nextInt();
            b = in.nextInt();
        }
//TODO make faster - check only for 5, 6-ended numbers and one special check for 1;
        for (long i = a; i <= b; i++) {
            for (long j = i; j > 0; j = j/10) {
                d = d*10;
            }
            if ((i*i)%d == i) {
                success = true;
                System.out.print(i + " ");
            }
            d = 1;
        }

        if (!success) System.out.println(-1);
    }
}