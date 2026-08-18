public class car {
    // attributes
    private int speed;
    private float angle;

    // object count
    static int count = 0;

    // null constructors
    public car() {
        this.speed = 100;
        this.angle = 0;
        count++;
    }

    // parametrized constructor
    public car(int speed, float angle) {
        this.speed = speed;
        this.angle = angle;
        count++;
    }

    // copy constructor
    car(car c) {
        this.speed = c.speed;
        this.angle = c.angle;
        count++;
    }

    // setter method
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    // getter method
    public int getSpeed() {
        return speed;
    }

    public float getAngle() {
        return angle;
    }

    public int getCount() {
        return count;
    }

    // string method
    public String toString() {
        return speed + " " + angle;
    }

    // display method
    public void display() {
        System.out.println("speed:" + speed);
        System.out.println("angle:" + angle);
        System.out.println("Total object = " + getCount());
        System.out.println(toString());
    }
}
