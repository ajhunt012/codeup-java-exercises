package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        System.out.println("Area from Rectangle.");
        return length * width;
    }

    public double getPerimeter() {
        System.out.println("Perimeter from Rectangle.");
        return 2 * length + 2 * width;
    }
}