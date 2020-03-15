import java.util.*;

class Solution {
    public boolean solve(String s) {
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++)
            for (int j = i+1; j < chars.length; j++)
                if (chars[i] == chars[j])
                    return false;
        return true;
    }
}
