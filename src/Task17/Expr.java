package Task17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Expr {
    public void control() {
        Scanner scan = new Scanner(System.in);
        java.lang.String expression, example;
        expression = "abcdefghijklmnopqrstuv18340";
        example = scan.nextLine();
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(example);
        if (m.find()) {
            System.out.println("Expression is right");
        } else {
            System.out.println("Expression is false");
        }
    }
}
