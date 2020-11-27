package Task21.Task1;

public class ComplexNumber {
    int re; // действительная часть
    int im; // мнимая часть

    public ComplexNumber(int re, int im) {
        this.re =re;
        this.im = im;
    }

    public ComplexNumber newComplexNum(int re, int im) {
        return new ComplexNumber(re, im);
    }

    @Override
    public String toString() {
        return re + "+" + im + "i";
    }

    // сложение комплексных чисел по формуле: (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.re + num2.re, num1.im + num2.im);
    }
    // вычитание комплексных чисел по формуле: (a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNumber sub(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.re - num2.re, num1.im - num2.im);
    }
    // умножение комплексных чисел по формуле: (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public ComplexNumber mul(ComplexNumber num1, ComplexNumber num2) {
        int a = num1.re, b = num1.im, c = num2.re, d = num2.im;
        return new ComplexNumber(a * c - b * d, b * c + a * d);
    }
    // деление комплексных чисел по формуле:
    //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNumber div(ComplexNumber num1, ComplexNumber num2) {
        int a = num1.re, b = num1.im, c = num2.re, d = num2.im;
        return new ComplexNumber((a * c + b * d) / (c * c + d * d),
                (b * c - a * d) / (c * c + d * d));
    }
}

