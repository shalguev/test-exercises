import java.util.Scanner;

public class ConsoleInteraction {

    private final static int MAX_ARR_LENGTH = 1000;

    private int[] priceArr = new int[MAX_ARR_LENGTH];

    public int[] getPriceArray() {
        this.readAndCheckNumbers();
        return this.priceArr;
    }

    private void readAndCheckNumbers() {
        final Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < MAX_ARR_LENGTH) {
            String nextLine = sc.nextLine();

            try {
                priceArr[i] = Integer.parseInt(nextLine);
            } catch (Exception e) {
                priceArr = new int[0];
                break;
            }

            if (priceArr[i] == 0) {
                break;
            }

            if (priceArr[i] < 0 || priceArr[i] > 10000) {
                priceArr = new int[0];
                break;
            }

            i++;
        }
        sc.close();
    }
}