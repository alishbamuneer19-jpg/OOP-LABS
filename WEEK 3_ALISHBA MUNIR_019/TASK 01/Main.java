import OOP.line;
import OOP.point;

public class Main {
    public static void main(String[] args) {
        point p1 = new point();
        point p2 = new point(2,7);
        point p3 = new point(3,6);
        point p4 = new point(p1);
        point p5 = new point();
        point p6 = new point();
        point newPoint1 = p2.addPoint(p3);
        point newPoint2 = p2.subPoint(p3);
        point newPoint3= p2.multiPoint(p3);
        point newPoint4 = p2.divPoint(p4);

        p5.setData(1,8);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        p6.locate();
        System.out.println(newPoint1);
        System.out.println(newPoint2);
        System.out.println(newPoint3);
        System.out.println(newPoint4);

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

        L4.display();
        L5.setPoints(p1,p2);
        L5.display();
    }
}
