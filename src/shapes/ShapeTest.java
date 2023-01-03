package shapes;

public class ShapeTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        // 18
        System.out.println(box1.getArea());
        // 20



        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        // 20
        System.out.println(box2.getArea());
        // 25


    }

}