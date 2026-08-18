public class calculator {
    // attributes
    private double num1;
    private double num2;

    // object count
    static int count = 0;

    // null constructor
    public calculator() {
        this.num1 = 0;
        this.num2 = 0;
        count++;
    }

    // parameterized constructor
    public calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        count++;
    }

    // copy constructor
    calculator(calculator c) {
        this.num1 = c.num1;
        this.num2 = c.num2;
        count++;
    }

    // setter method
    public void setData(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // getter method
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return num1 + " " + num2;
    }

    public void display() {
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Count: " + getCount());
        System.out.println(toString());
    }
}
