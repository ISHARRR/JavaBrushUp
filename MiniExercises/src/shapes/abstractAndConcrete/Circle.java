package shapes.abstractAndConcrete;

import shapes.inheritance.Shape;

public class Circle extends Shape {
    private double radius;

    Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return ((radius*radius)*Math.PI);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                "radius=" + radius +
                '}';
    }
}
