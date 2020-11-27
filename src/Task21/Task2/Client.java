package Task21.Task2;

import java.util.Scanner;

public class Client implements Chair {
    private Chair chair;

    public Client() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Викторианский стул");
        System.out.println("2. Многофункциональный стул");
        System.out.println("3. Магический стул");
        int ch;
        ch = scanner.nextInt();
        switch (ch) {
            case 1:
                ChairFactory factory1 = new VictorianByFactory();
                chair= factory1.makeNewChair();
                break;
            case 2:
                ChairFactory factory2 = new MultyfunctionByFactory();
                chair= factory2.makeNewChair();
                break;
            case 3:
                ChairFactory factory3 = new MagicByFactory();
                chair= factory3.makeNewChair();
                break;
        }
    }

    @Override
    public void sit() {
        chair.sit();
    }
}
