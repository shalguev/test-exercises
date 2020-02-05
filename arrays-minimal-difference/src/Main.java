import java.util.*;

class Main {
    public static void main(String[] args) {
        final ConsoleInteraction ci = new ConsoleInteraction();

        final int numOfElem = 1000;

        final int[] arrN;
        final int[] arrM;

        try {
            arrN = ci.getArrN();
            arrM = ci.getArrM();
        } catch (Exception e) {return;}

        /*{
            arrN = new int[numOfElem];
            arrM = new int[numOfElem];
            final Random random = new Random();

            for (int i = 0; i < numOfElem; i++) {
                arrN[i] = random.nextInt();
                arrM[i] = random.nextInt();
            }

            Arrays.sort(arrN);
            Arrays.sort(arrM);
        }
        final long start = System.nanoTime();*/

        int i = 0, j = 0, nLength = arrN.length, mLength = arrM.length;
        long resultN = -1, resultM = -1, tempDiff = Long.MAX_VALUE, diff = Long.MAX_VALUE;

        while (i < nLength && j < mLength) {
            tempDiff = Math.abs(arrN[i] - arrM[j]);

            if (tempDiff < diff) {
                diff = tempDiff;
                resultN = arrN[i];
                resultM = arrM[j];
            }

            if (arrN[i] < arrM[j]) {
                i++;
            } else if (arrN[i] > arrM[j]) {
                j++;
            } else {break;} // diff == 0
        }

//        finishBenchmark(start, numOfElem);
        ci.showResult(resultN, resultM);
    }

    /*private static void finishBenchmark(final long start, final int numOfElem) {
        final long finish  = System.nanoTime();
        System.out.format("Time elapsed: %.5f\nNumber of elements: %s\n",
                            (finish - start)*1E-9, numOfElem);
    }*/
}

class ConsoleInteraction {
    private final static int MAX_ARR_N_LENGTH = 1000_000;
    private final static int MAX_ARR_M_LENGTH = 1000_000;

    final Scanner sc = new Scanner(System.in);

    public int[] getArrN() {
        return this.readAndCheckRow(getN());
    }

    public int[] getArrM() {
        return this.readAndCheckRow(getM());
    }

    public void showResult(final long resultN, final long resultM) {
        System.out.println(resultN + " " + resultM);
    }

    private int getN() {
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0 && n <= MAX_ARR_N_LENGTH) {
            return n;
        } else return -1;
    }

    private int getM() {
        int m = Integer.parseInt(sc.nextLine());
        if (m > 0 && m <= MAX_ARR_M_LENGTH) {
            return m;
        } else return -1;
    }

    private int[] readAndCheckRow(final int arrLength) {
        final int[] result = new int[arrLength];

        String[] nextLine = sc.nextLine().split(" ");

        for (int i = 0; i < arrLength; i++) result[i] = Integer.parseInt(nextLine[i]);

        return result;
    }
}