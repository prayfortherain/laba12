import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //String input = "1.32.123.345.322.434.66.43.43.21.112.122.1214544";
        Pattern pattern = Pattern.compile("((\\d|\\d\\d|1\\d\\d|1\\d\\d|2[1;4]\\d|250)\\.){3}(\\d|1\\d\\d|1\\d\\d|2[1;4]\\d|250){1,3}");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}