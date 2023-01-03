package shapes;

class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }
}
