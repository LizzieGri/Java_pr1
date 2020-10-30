package Task17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class MACaddress {
    public void control() {
        Scanner scan = new Scanner(System.in);
        String macExpression, example;
        macExpression = "(^([A-Fa-f]{2}[:]){3}([0-9]{2}[:]){2}([0-9]{2})$)";
        example = scan.nextLine();
        Pattern p = Pattern.compile(macExpression);
        Matcher m = p.matcher(example);
        if (m.find()) {
            System.out.println("MAC-address is right");
        } else {
            System.out.println("MAC-address is false");
        }
    }
}
