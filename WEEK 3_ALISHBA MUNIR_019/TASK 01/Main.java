import OOP.line;
import OOP.point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2,7);
        Point p3 = new Point(3,6);
        Point p4 = new Point(p1);
        Point p5 = new Point();
        Point p6 = new Point();
        Point newPoint1 = p2.addPoint(p3);
        Point newPoint2 = p2.subPoint(p3);
        Point newPoint3= p2.multiPoint(p3);
        Point newPoint4 = p2.divPoint(p4);
        float d = p3.distanceTo(p2); // toDistance method

        System.out.println("p1 = ");
        p1.display();
        System.out.println("p2 = ");
        p2.display();
        System.out.println("p3 = ");
        p3.display();
        System.out.println("p4 = ");
        p4.display();

        System.out.println("Set data");
        p5.setData(1,8);
        System.out.println("p5 = ");
        p5.display();



        System.out.println("Location =  ");
        p6.locate();
        System.out.println("Add point");
        System.out.println(newPoint1);
        System.out.println("Subtract point");
        System.out.println(newPoint2);
        System.out.println("Multiply point");
        System.out.println(newPoint3);
        System.out.println("Divide point");
        System.out.println(newPoint4);
        System.out.printf("Distance between two points =  %.2f %n ",d);

        System.out.println("Point object count = " + Point.getCount());


//        for line
        line L1 =  new line(); // null constructor
        line L2 = new line(p2,p3); //parametrized constructor
        line L3 = new line(p4,p5); //parametrized constructor
        line L4 = new line(L1); // copy constructor
        line L5 = new line(); //null constructor for setter



        L1.display();
        System.out.println(" Line 2 is :");
        L2.display();
        System.out.println("Line 3 is :");
        L3.display();
//       for point intersection
        point intersect = L2.intersection(L3);
        System.out.println(" The Intersection is :");
        System.out.println(intersect);
        
        System.out.println(" Line 4 is :");
        L4.display();
        System.out.println(" Set Line 5 is :");
        L5.setPoints(p1,p2);
        L5.display();
    }
}
