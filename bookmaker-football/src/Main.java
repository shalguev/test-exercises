public class Main {
    public static void main (String[]args) {
        final Main prizeCounter = new Main ();
        System.out.println(prizeCounter.countPrize(130, 0, 130, 129));
    }

    private int countPrize (final int guessedA, final int guessedB,
		                    final int realA, final int realB) {
        if (guessedA == realA && guessedB == realB) {
            return 2;
        } else if (guessedA > guessedB && realA > realB
                || guessedA < guessedB && realA < realB
                || guessedA == guessedB && realA == realB) {
            return 1;
        } else {
            return 0;
        }
    }
}
