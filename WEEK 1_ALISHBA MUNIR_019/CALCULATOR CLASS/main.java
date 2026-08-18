public class Main {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        calculator c2 = new calculator(18, 19);
        calculator c3 = new calculator(c1);
        calculator c4 = new calculator();

        c4.setData(19, 20);

        c4.display();
        c1.display();
        c2.display();
        c3.display();
    }
}
