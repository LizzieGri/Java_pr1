package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FurnitureShop bad = new Bad("Lerwick", 8999);
        FurnitureShop sofa = new Sofa("Friheten", 23999);

        System.out.println("Выберите товар который хотите купить :");
        System.out.println("1 - Кровать");
        System.out.println("2 - Диван");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        switch (k) {
            case 1:
                System.out.println("Ваша кровать: " + bad.getName());
                System.out.println("Ваша кровать стоит: " + bad.getFurnitureCost());
                System.out.println("Спасибо за покупку!!!");
                break;
            case 2:
                System.out.println("Ваш диван: " + sofa.getName());
                System.out.println("Ваш диван стоит: " + sofa.getFurnitureCost());
                System.out.println("Спасибо за покупку!!!");
                break;
        }
    }
}
