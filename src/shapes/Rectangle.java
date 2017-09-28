package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int aLength, int aWidth){
        this.length = aLength;
        this.width = aWidth;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    public int getPerimeter(){
        int rectanglePerimeter = 2 * length + 2 * width;
        return rectanglePerimeter;

    }

    public int getArea(){
        int rectangleArea = length * width;
        return rectangleArea;
    }
}
