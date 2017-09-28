package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        showRectangleInfo(box1);

        Rectangle box2 = new Square(5);
        showRectangleInfo(box2);
    }
    public static void showRectangleInfo(Rectangle rect){
        System.out.println("Perimeter is " + rect.getPerimeter());
        System.out.println("Area is " + rect.getArea());
    }
}
