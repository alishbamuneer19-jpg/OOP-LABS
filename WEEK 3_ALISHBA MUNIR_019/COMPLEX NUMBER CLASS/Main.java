import OOP.WEEK03.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber(3,4);
        ComplexNumber c3 = new ComplexNumber(5,6);
        ComplexNumber c4 = new ComplexNumber(c2);
        ComplexNumber c5 = new ComplexNumber();
        ComplexNumber result1= c2.add(c3);
        ComplexNumber result2= c2.sub(c3);
        ComplexNumber result3= c2.multiply(c3);
        ComplexNumber result4= c2.divide(c3);
        boolean result5= c2.equals(c3);

        c5.setNumber(6,8);

        System.out.println("1st complex number: " + c1);
        System.out.println("2nd complex number: " + c2);
        System.out.println("3rd complex number: " + c3);
        System.out.println("4th complex number: " + c4);
        System.out.println("5th Set complex number: " + c5);

        System.out.println("Add ComplexNumber = " + result1);
        System.out.println("Subtract ComplexNumber = " + result2);
        System.out.println("Multiply ComplexNumber = " + result3);
        System.out.println("Divide ComplexNumber = " + result4);

        System.out.println("conjugate c2 = " + c2.conjugate());
        System.out.println("Magnitude of c2 = " + c2.magnitude());
        System.out.println("Is c2 equal to c3 = " + result5);

        System.out.println("Total Objects = " + ComplexNumber.getCount());
    }
}
