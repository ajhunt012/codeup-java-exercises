package shapes;

public class ShapeTest {
    public static void main(String[] args) {


//        Rectangle box1 = new Rectangle(4, 5) {
//            @Override
//            public double getPerimeter() {
//                return 0;
//            }
//
//            @Override
//            public double getArea() {
//                return 0;
//            }
//        };
//        System.out.println(box1.getPerimeter());
//        // 18
//        System.out.println(box1.getArea());
//        // 20
//
//
//
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        // 20
//        System.out.println(box2.getArea());
//        // 25

        Measurable myShape;


        myShape = new Square(10) {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println("Square perimeter is: " + myShape.getPerimeter());
        System.out.println("Square area is: " + myShape.getArea());

        myShape = new Rectangle(5, 10);
        System.out.println("Rectangle perimeter is: " + myShape.getPerimeter());
        System.out.println("Rectangle area is: " + myShape.getArea());
    }
}

