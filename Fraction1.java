

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 4;
        denominator = 6;

    }

    public Fraction(int num1, int num2) {
        this.numerator = num1;
        this.denominator = num2;

    }

    public void setNum1(int num1) {
        this.numerator = num1;
    }

    public void setNum2(int num2) {
        this.denominator = num2;
    }

    public int getNum1() {
        return numerator;
    }

    public int getNum2() {
        return denominator;
    }

    public void Display() {
        System.out.print(numerator + "/" + denominator);
    }

    public boolean equals(Fraction other) {
        int num1, num2;
        int num3, num4;
        int num5 = 1;
        for (int i = 2; i <= Math.min(numerator, denominator); i++) {

            if (numerator % i == 0 && denominator % i == 0) {
                num5 = i;
            }
        }

        num1 = numerator / num5;
        num2 = denominator / num5;

        int otherGcf = 1;
        for (int i = 2; i <= Math.min(other.numerator, other.denominator); i++) {

            if (other.numerator % i == 0 && other.denominator % i == 0) {
                otherGcf = i;
            }
        }

        num3 = other.numerator / otherGcf;
        num4 = other.denominator / otherGcf;

        return (num1 == num3 && num2 == num4);

    }

}
