package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
    Input input = new Input();
        Circle circle = new Circle(3);

    System.out.println("the area of the circle is " + circle.getArea());

    circle.getCircumference();
    }
}
