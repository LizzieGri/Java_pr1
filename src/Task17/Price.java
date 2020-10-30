package Task17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Price {
    public void control() {
        Scanner scan = new Scanner(System.in);
        String value, example;
        value = "(^([0-9]{2}[.])([0-9]{2}[ ])([U][S][D]|[R][U][B]|[E][U])$)";
        example = scan.nextLine();
        Pattern p = Pattern.compile(value);
        Matcher m = p.matcher(example);
        if (m.find()) {
            System.out.println("Price is right");
        } else {
            System.out.println("Price is false");
        }
    }
}
