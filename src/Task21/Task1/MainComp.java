package Task21.Task1;

public class MainComp {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(5, 7);
        System.out.println(num1.add(num1, num2));
        System.out.println(num1.sub(num1, num2));
        System.out.println(num1.mul(num1, num2));
        System.out.println(num1.div(num1, num2));
    }
}
