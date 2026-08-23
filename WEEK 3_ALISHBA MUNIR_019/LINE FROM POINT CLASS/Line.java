package OOP;

public class line {
    //    attributes
    private point start;
    private point end;
    //    object count
    static int count = 0;

    //    null constructor
    public line() {
        this.start = new point(0, 1);
        this.end = new point(0, 2);
        count++;
    }

    //    parametrized constructor
    public line(point start, point end) {
        this.start = start;
        this.end = end;
        count++;
    }

    //    copy constructor
    public line(line other) {
        this.start = other.start;
        this.end = other.end;
        count++;
    }

    //      setter method
    public void setPoints(point start, point end) {
        this.start = start;
        this.end = end;
    }

    //    getter method
    public point getStart() {
        return this.start;
    }

    public point getEnd() {
        return this.end;
    }

    public int getCount() {
        return count;
    }

    //    intersection method
    public point intersection(line otherLine) {
//        line 1 ( this) k coordinates
        float x1 = this.start.getX(), y1 = this.start.getY();
        float x2 = this.end.getX(), y2 = this.end.getY();

//        float x1 = this.start.x,this.end.y;  ( yahan pr hum is trha is liye nh likh sakty bcz
//        hamary pass point class mai x ko humny private rakha tha that's why hum isko get sai karaingy )


//        line 2 ( otherLine k coordinates )
        float x3 = otherLine.start.getX(), y3 = otherLine.start.getY();
        float x4 = otherLine.end.getX(), y4 = otherLine.end.getY();
//        calculating denominator
        float d = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
//        check whether the lines are parallel or not
        if (d == 0) {
            System.out.println("Intersection failed");
            return null;
        } else {
//            find determinants of both line
            float term1 = (x1 * y2) - (y1 * x2);
            float term2 = (x3 * y4) - (y3 * x4);
//            final intersection point ( px , py )
//            formula : px = (term 1 * line 2 difference of x )-(line1 difference of x * term 2 )/d
            float px = (term1 * (x3 - x4) - (x1 - x2) * term2) / d;
            float py = (term1 * (y3 - y4) - (y1 - y2) * term2) / d;
            return new point(px, py);
        }
    }
//    display method
    public void display () {
        System.out.println("Start Point = " + this.start + "End Point = " + this.end);
        System.out.println("Total count = "+ getCount());
    }
//    toString method
    @Override
    public String toString() {
        return "Start Point = " + this.start + "End Point = " + this.end;
    }
}
