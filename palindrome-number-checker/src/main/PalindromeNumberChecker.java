class PalindromeNumberChecker {
    public boolean solve(int num) {
        int reversedNum = 0;
        int remaining = 0;
        for (int i = num; i > 0; i = i/10) {
            remaining = i % 10;
            reversedNum = 10 * reversedNum + remaining;
        }
        return num == reversedNum;
    }
}
