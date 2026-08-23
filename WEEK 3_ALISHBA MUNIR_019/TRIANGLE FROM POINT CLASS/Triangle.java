package OOP.WEEK03;

public class Triangle {
    //    attributes
    private Point p1;
    private Point p2;
    private Point p3;
    static int count = 0; // object count

    //    null constructor
    public Triangle() {
        this.p1 = new Point(2, 4);
        this.p2 = new Point(5, 6);
        this.p3 = new Point(7, 8);
        count++;
    }

    //    parametrized constructor
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        count++;
    }

    //    copy constructor
    public Triangle(Triangle t) {
        this.p1 = t.p1;
        this.p2 = t.p2;
        this.p3 = t.p3;
        count++;
    }

    //    setter method
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    //    getter method
    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public Point getP3() {
        return this.p3;
    }

    public static int getCount() {
        return count;
    }

    //      getSideLength Method
//    METHOD: teeno points k beech ki sides calculate kr k array mai return krta hai
    public float[] getSidesLength() {
//        p1 sai p2 ka distance = side a
        float sideA = p1.distanceTo(p2);
//        p2 sai p3 ka distance = side b
        float sideB = p2.distanceTo(p3);
//        p3 sai p1 ka distance = side c
        float sideC = p3.distanceTo(p1);
        return new float[]{sideA, sideB, sideC};
    }

    //    get perimeter method
//    METHOD : sum of three sides
    public float getPerimeter() {
//        1st getSideslength sai teeno sides lai li
        float[] side = getSidesLength();
//        teeno sides (sideA +sideB + sideC) ka sum return krdiya
        return side[0] + side[1] + side[2];
    }

    //    area method
//    when we have a length of three sides then we use heron's formula to get area
//    formula : area = sqrt s(s-a)(s-b)(s-c)
//    where s = a+b+c/2
    public float getArea() {
        float[] side = getSidesLength();
        float a = side[0];
        float b = side[1];
        float c = side[2];

        float s = (a + b + c) / 2; //semi perimeter
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    //  type by side method
//    METHOD: if three sides = equilateral triangle
//              if two sides = Isosceles
//             if three sides are not equal = scalene
    public String getTypeBySide() {
        float[] side = getSidesLength();
        float a = side[0];
        float b = side[1];
        float c = side[2];

        if (a == b && b == c) { // && (AND( operator means sari condition ka true hona zaroori hai
            return "Equilateral Triangle"; // teeno equal
        } else if (a == b || b == c || a == c) { // || (OR) operator means koi ek condition bh true hojaye tw kaafi hai
            return "Isosceles Triangle"; // two equal
        } else {
            return " scalene Triangle"; // sb alg
        }
    }

//   validation check method
    // Method: Yeh check karta hai ki points sach mein ek Triangle banate hain ya nahi
    public boolean isValidTriangle() {

        // Step 1: Teeno sides ki lengths nikal kar array se alag-alag variables mein save ki
        float[] side = getSidesLength();
        float a = side[0]; // Pehli side
        float b = side[1]; // Doosri side
        float c = side[2]; // Teesri side

        // Step 2: Math ka rule check kar rahe hain (Triangle Inequality Theorem)
        // Rule: Kisi bhi 2 sides ka jod (sum) teesri side se hamesha bada (>) hona chahiye

        boolean condition1 = (a + b > c); // Kya (Side 1 + Side 2) > Side 3 hai?
        boolean condition2 = (b + c > a); // Kya (Side 2 + Side 3) > Side 1 hai?
        boolean condition3 = (a + c > b); // Kya (Side 1 + Side 3) > Side 2 hai?

        // Step 3: Agar TEENO conditions true hain, tabhi true return hoga (Valid Triangle)
        // '&&' ka matlab hai ki teeno baaton ka ek saath sahi hona zaroori hai
        return condition1 && condition2 && condition3;
    }


    //    display method
    public void display() {
        System.out.println("Point p1 =" + this.p1);
        System.out.println("Point p2 =" + this.p2);
        System.out.println("Point p3 =" + this.p3);
    }

    //    toString method
    @Override
    public String toString() {
        String s = "Trianlge = " + " p1 = " + this.p1 + " p2 = " + this.p2 + " p3 = " + this.p3;
        return s;
    }
}






