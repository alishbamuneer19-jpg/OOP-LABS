import OOP.WEEK03.Point;
import OOP.WEEK03.Triangle;

import java.util.Arrays;


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

      
//         FOR TRIANGLE
        Triangle t1 = new Triangle(); // null constructor
        Triangle t2 = new Triangle( p1,p2,p3); // parametrized constructor
        Triangle t3 = new Triangle( t1); //copy constructor
        Triangle t4 = new Triangle(); // for setter

        System.out.println("Triangle 1 =" );
        t1.display();
        System.out.println("Triangle 2 =" );
        t2.display();
        System.out.println("Triangle 3 =" );
        t3.display();

        t4.setP1(p1);
        t4.setP2(p2);
        t4.setP3(p3);
        System.out.println("set triangle t4");
        t4.display(); // we can also print it  by toString like this soutln(t4)

//        float[] side = t1.getSidesLength();// Step 1: t1.getSidesLength() se teenon sides ki values lekar 'side' naam
        // ke double array variable mein save kar rahe hain
//        System.out.printf("triangle t1 sides = [ %.2f,%.2f,%.2f]%n",side[0],side[1],side[2]);// Step 2: System.out.printf
        // formatted text print karne ke liye use ho raha hai (println ki jagah)
// "triangle t1 sides = [%.2f, %.2f, %.2f]%n" -> Yeh format template hai
//      - %.2f  -> Pehli side ko point ke baad 2 decimals tak round karega
//      - %.2f  -> Doosri side ko point ke baad 2 decimals tak round karega
//      - %.2f  -> Teesri side ko point ke baad 2 decimals tak round karega
//      - %n    -> Print karne ke baad new line (enter) daal dega
// side[0], side[1], side[2] -> Yeh array se 1st, 2nd, aur 3rd side ki actual values utha kar formatting specs mein daal raha hai



        if (t1.isValidTriangle()) {

            // Step 1: Sides ki length array mein li
            float[] side = t1.getSidesLength();

            System.out.printf("triangle t1 sides = [ %.2f, %.2f, %.2f ]%n", side[0], side[1], side[2]);

            // Step 2: Baaki saare calculations print karein
            System.out.printf("perimeter = %.2f %n", t1.getPerimeter());
            System.out.printf("area = %.2f %n", t1.getArea());
            System.out.println("Type By Side = " + t1.getTypeBySide());

        } else {
            // Agar points milkar valid triangle nahi banate:
            System.out.println("Invalid Triangle! Given points do not form a triangle.");
        }

        System.out.println("Triangle Count = " + Triangle.getCount());
    }

