package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    private static final String SINGLE_GROUP_PATTERN = "(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])";
    private static final String REGEX = "(" + SINGLE_GROUP_PATTERN + "\\.){3}" + SINGLE_GROUP_PATTERN;

    private final Pattern pattern;

    public Regex() {
        pattern = Pattern.compile(REGEX);
    }

    public boolean isIpAddress(String input) {
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        boolean ipAddress = new Regex().isIpAddress("0.255.255.255");
        System.out.println(ipAddress);
    }
}