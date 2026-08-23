import OOP.WEEK03.RationalNumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber R1 = new RationalNumber();
        RationalNumber R2 = new RationalNumber(1, 2);
        RationalNumber R3 = new RationalNumber(6, 8);
        RationalNumber R4 = new RationalNumber(R2);
        RationalNumber R5 = new RationalNumber(); // for setter
        R5.setNumerator(4);
        R5.setDenominator(2);
        RationalNumber result1 = (R2).add(R3);
        RationalNumber result2 = (R2).subtract(R3);
        RationalNumber result3 = (R2).multiply(R3);
        RationalNumber result4 = (R2).divide(R3);
        boolean result5 = (R2).equals(R3);


        System.out.println("1st Rational Number = ");
        R1.display();
        System.out.println("2nd Rational Number = ");
        R2.display();
        System.out.println("3rd Rational Number = ");
        R3.display();
        System.out.println("4th Rational Number = ");
        R4.display();
        System.out.println("5th Set Rational Number = ");
        R5.display();
        System.out.println("Add Rational Number = ");
        System.out.println(result1);
        System.out.println("Subtract Rational Number = ");
        System.out.println(result2);
        System.out.println("Multiply Rational Number = ");
        result3.display();
        System.out.println("Divide Rational Number = ");
        result4.display();
        System.out.println("2nd Rational Number into decimal = ");
        System.out.println(R2.Decimal());
        System.out.println("Is R1 equalsTo R2 = ");
        System.out.println(result5);
    }
}
