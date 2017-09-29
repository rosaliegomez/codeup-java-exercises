package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length=length;
    }
    @Override
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
//    private int length;
//    private int width;
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength(){
//        return this.length;
//    }
//
//    public int getWidth(){
//        return this.width;
//    }
//
//    public int getPerimeter(){
//        return  2 * length + 2 * width;
//
//    }
//
//    public int getArea(){
//        return length * width;
//    }
}
