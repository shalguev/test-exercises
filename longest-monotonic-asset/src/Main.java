public class Main {

    public static void main(String[] args) {

        ConsoleInteraction ci = new ConsoleInteraction();
        int[] priceArr = ci.getPriceArray();

        int size = 0;
        while(size < priceArr.length && priceArr[size] > 0) size++;

        if (size == 0) return;

        int longestMonotonic = 0;
        int longMonotonic = 0;

        // checking subsequences for rising...
        int i = 0;
        while (i < size) {
            i++;
            longMonotonic = 1;
            while (i < size && priceArr[i-1] < priceArr[i]) {
                longMonotonic++;
                i++;
            }
            if (longestMonotonic < longMonotonic) longestMonotonic = longMonotonic;
        }

        // ... and for falling
        i = 0;
        while (i < size) {
            i++;
            longMonotonic = 1;
            while (i < size && priceArr[i] < priceArr[i-1]) {
                longMonotonic++;
                i++;
            }
            if (longestMonotonic < longMonotonic) longestMonotonic = longMonotonic;
        }

        System.out.println(longestMonotonic);
    }
}