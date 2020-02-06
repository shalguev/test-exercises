import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        final ConsoleInteraction ci = new ConsoleInteraction();

        int[][] arrLR;
        try {
            arrLR = ci.getArrLR();
        } catch (Exception e) {return;}

        int intervalLength; // length of current interval
        final Set<Integer> resultSet = new TreeSet<>(); // set of resulting "intervals"

        for (int i = 0; i < arrLR.length; i++) {
            intervalLength = arrLR[i][1] - arrLR[i][0];

            ArrayList<Integer> interval = new ArrayList<>(intervalLength);

            for (int j = arrLR[i][0]; j < arrLR[i][1]; j++) interval.add(j);

            resultSet.addAll(interval);
        }

        System.out.println(resultSet.size());
    }
}
