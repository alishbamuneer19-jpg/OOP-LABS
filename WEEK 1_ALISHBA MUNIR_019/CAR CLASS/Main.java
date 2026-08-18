public class Main {
    public static void main(String[] args) {
        car bmw = new car();
        car tesla = new car(200, 35);
        car deepal = new car(bmw);
        car revoGr = new car();

        revoGr.setSpeed(150);
        revoGr.setAngle(45);

        revoGr.display();
        bmw.display();
        tesla.display();
        deepal.display();
    }
}
