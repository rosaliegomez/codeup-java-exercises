package shapes;

public class Square extends Quadrilateral {

    private double side;


    public Square(double side) {
        super(side, side);
        this.side = side;

    }


    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;


    }
    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }


//    public int getPerimeter(){
//        return 4 * side;
//    }
//
//    public int getArea(){
//        return side * side;
//    }

}
