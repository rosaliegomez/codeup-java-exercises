package shapes;

import java.util.Scanner;

public class Circle {

    private double radius;
    double pi = 3.14159;
    Scanner scan = new Scanner(System.in);

    //this is the constructor.
    public Circle (double aRadius){
        this.radius = aRadius;
    }




    public double getArea(){
        System.out.println("What is the area?");
        double area = pi* (radius * radius);
        System.out.println(area);
        return area;
    }
    public double getCircumference(){
        System.out.println("The circumference is: ");
        double circumference = 2 * pi * radius;
        System.out.println(circumference);
        return circumference;
    }

}
