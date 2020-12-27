package circle_basic;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea() +" "+  c.getColour() +" "+  c.getRadius());
        System.out.println(c.toString());

        Circle c1 = new Circle(2);
        System.out.println(c1.getArea() +" "+  c1.getColour() +" "+ c1.getRadius());
        System.out.println(c1.toString());

        Circle c2 = new Circle(3, "yellow");
        System.out.println(c2.getArea() +" "+  c2.getColour() +" "+ c2.getRadius());
        c2.setRadius(4);
        System.out.println(c2.toString());
    }
}
