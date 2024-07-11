package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        //Word Match
        Pattern pattern = Pattern.compile("^(a|A)gent \\d{3,4}$");
        Matcher matcher = pattern.matcher("agent 007"); //match
        Matcher matcher1 = pattern.matcher("Agent 0007A"); //not-match

        boolean found = matcher.find();
        System.out.println("Found: "+found);
        found = matcher1.find();
        System.out.println("Found: "+found);

        //Masking Number
        String cardNumber = "4123-6754-9083-2987";

        Pattern pattern1 = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
        Matcher matcher2 = pattern1.matcher(cardNumber);

        String maskedCardNumber = matcher2.replaceAll("XXXX-XXXX-XXXX-");
        System.out.println(maskedCardNumber);

        //String to int
        Pattern pattern2 = Pattern.compile("^(\\d+) divided by (\\d+)$");
        Matcher matcher3 = pattern2.matcher("10 divided by 2");

        if (matcher3.find()){
            String simplified = matcher3.replaceFirst("$1/$2");
            System.out.println(simplified);
            int result = Integer.valueOf(matcher3.group(1)) / Integer.valueOf(matcher3.group(2));
            System.out.println(result);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
