import java.util.Scanner;

public class Fraction_Runner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numerator, denominator;
        System.out.print("Enter target Fraction's Numerator: ");
        numerator = kb.nextInt();
        System.out.print("Enter target Fraction's Denominator: ");
        denominator = kb.nextInt();
        Fraction fraction = new Fraction(numerator, denominator);
        System.out.print("Enter new numerator: ");
        int otherNumerator = kb.nextInt();
        System.out.print("Enter new denominator: ");
        int otherDenominator = kb.nextInt();
        Fraction otherFraction = new Fraction(otherNumerator, otherDenominator);
        if (fraction.equals(otherFraction)) {
            fraction.Display();
            System.out.print(" is equal to ");
            otherFraction.Display();
        } else {
            fraction.Display();
            System.out.print(" is not equal to ");
            otherFraction.Display();
        }
        System.out.println();
    }
}
