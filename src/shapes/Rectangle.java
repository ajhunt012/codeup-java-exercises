package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    public Rectangle(double i, double i1) {
//        super();


//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        System.out.println("Area from Rectangle.");
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        System.out.println("Perimeter from Rectangle.");
//        return 2 * length + 2 * width;
//    }


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
