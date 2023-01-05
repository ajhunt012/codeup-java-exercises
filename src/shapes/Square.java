package shapes;

public abstract class Square extends Quadrilateral {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getPerimeter(){
        return 4 * length;
    }

    @Override
    public double getArea(){
        return length * length;
    }
}
