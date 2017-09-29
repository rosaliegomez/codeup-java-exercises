package shapes;

import java.util.Scanner;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
//        Measurable box2;
        Scanner scanner = new Scanner(System.in);
        myShape = new Rectangle(5, 4);
        showRectangleInfo(myShape);

        myShape = new Square(5);
        showRectangleInfo(myShape);


//        Measurable myShape = new Rectangle(10, 10);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
        /*Alternatively, a for loop would look like the following:
        Rectangle[] recs = {rec, sqr);
        for (Rectangle r : recs){
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

    */
    public static void showRectangleInfo(Measurable rect){
        System.out.println("Perimeter is " + rect.getPerimeter());
        System.out.println("Area is " + rect.getArea());
    }
}
