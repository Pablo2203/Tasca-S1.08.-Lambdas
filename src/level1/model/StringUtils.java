package level1.model;

public class StringUtils {
    public StringUtils() {
    }

    public static int getLength(String s) {
        return s.length();
    }
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}


