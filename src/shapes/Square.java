package shapes;

class Square extends Rectangle {

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    public double getArea(){
        System.out.println("Area from Square.");
        return (int) (this.side * this.side);
    }


    public double getPerimeter() {
        System.out.println("Perimeter from Square.");
        return (int) (4 * this.side);
    }
}
