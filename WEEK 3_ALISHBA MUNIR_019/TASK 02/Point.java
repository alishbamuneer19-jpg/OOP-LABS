package OOP.WEEK03;

public class Point {
    //    attributes
    private float x;
    private float y;
    //    object count
    static int count = 0;

    //    null constructor
    public Point() {
        this.x = 1;
        this.y = 1;
        count++;
    }

    //    parametrized constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
        count++;
    }

    //    copy constructor
    public Point(Point P) {
        this.x = P.x;
        this.y = P.y;
        count++;
    }

    //    setter method
    public void setData(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //    getter method
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public static int getCount() {
        return count;
    }

    //    locate method
    public void locate() {
        System.out.println("x = " + this.x + " y = " + this.y);
    }

    //    add point method
    public Point addPoint(Point obj) {
            float newx = this.x + obj.x;
        float newy = this.y + obj.y;
        return new Point(newx, newy);
    }

    //    subtract point method
    public Point subPoint(Point obj) {
        float newx = this.x - obj.x;
        float newy = this.y - obj.y;
        return new Point(newx, newy);
    }

    //    multiply point method
    public Point multiPoint(Point obj) {
        float newx = this.x * obj.x;
        float newy = this.y * obj.y;
        return new Point(newx, newy);
    }

    //     divide point method
    public Point divPoint(Point obj) {
        float newx = this.x / obj.x;
        float newy = this.y / obj.y;
        return new Point(newx, newy);
    }

    //     distanceTO
    public float distanceTo(Point other) { //distance formula : d = sqrt ( x2 -x1 )^2 + ( y2 - y1 )^2
        if (other == null) {
            return 0.0f;
        } else {
            float deltax = this.x - other.x;
            float deltay = this.y - other.y;
            return (float) Math.sqrt(deltax * deltax + deltay * deltay);
//            yahan humny float isiliye use kiya hai ku k math.sqrt hmaray pass double
//            return krta hai or agr hum yahan math.sqrt sai pehly float laga daingy tw yeh humy phr float return karega
//            isiliye phr uper 0.0 ka sth bh f lagan para
        }
    }

    //    display method (this is known as informal method)
   public void display() {
        System.out.println("x = " + this.x + " y = " + this.y);
    }

    //    toString method ( this is known as formal alternative to user defined display)
    public String toString() {
        String s = "x = " + this.x + " y = " + this.y;
        return s;
    }
}
