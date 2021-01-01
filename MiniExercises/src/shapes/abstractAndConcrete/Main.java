package shapes.abstractAndConcrete;

public class Main {
    public static void main(String[] args) {
        Square s1 = new Square("red", true, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColour());
        System.out.println(s1.isFilled());

        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

//can not be used as shape is an abstract class
//        Shape s4 = new Square(6.6);
//        System.out.println(s4);
//        System.out.println(s4.getArea());
//        System.out.println(s4.getColor());
//        System.out.println(s4.getSide());


        Rectangle r2 = new Rectangle();
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getLength());

        Square sq1 = new Square(5);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
