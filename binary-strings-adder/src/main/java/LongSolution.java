class LongSolution {
    public String solve(String a, String b) {
        if (a.length() > b.length()) {
            return this.summator(a, b);
        } else {
            return this.summator(b, a);
        }
    }
    
    private String summator(final String a, final String b) {
        final char[] sum = new char[a.length() + 1];
        final char[] bChars = new char[a.length() + 1];
        char remainder = '0';
        int diff = a.length() - b.length();
        
        for (int i = sum.length - 1; i > 0; i--) {
            sum[i] = a.charAt(i - 1);
        }
        
        for (int i = bChars.length - 1; i > diff; i--) {
            bChars[i] = b.charAt(i - 1 - diff);
        }
        
        for (int i = sum.length - 1; i > 0; i--) {
            if (sum[i] == bChars[i]) {
                sum[i] = remainder;
                remainder = '0';
                if (bChars[i] == '1') { remainder = '1'; }
            } else if (remainder == '1') {
                sum[i] = '0';
                remainder = '1';
            } else {
                sum[i] = '1';
            }
        }
        if (remainder == '1') { sum[0] = remainder; }
        return new String(sum).trim();
    }
}
