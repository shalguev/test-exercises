import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        final String password;
        final Pattern pattern;
        final Matcher matcher;

        try (final Scanner in = new Scanner(System.in)) {
            password = in.nextLine();
        }

        pattern = Pattern.compile("((?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,1000})");
        matcher = pattern.matcher(password);

        if (matcher.matches()) System.out.println("YES");
        else System.out.println("NO");
    }
}