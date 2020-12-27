package circle_basic;

//A class called circle is designed as shown in the following class diagram. It contains:
//
//        Two private instance variables: radius (of the type double) and color (of the type String), with default value of 1.0 and "red", respectively.
//        Two overloaded constructors - a default constructor with no argument, and a constructor which takes a double argument for radius.
//        Two public methods: getRadius() and getArea(), which return the radius and area of this instance, respectively.

public class Circle {
    private double radius;
    private String colour;

    Circle(){
        this.radius = 1.0;
        this.colour = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        this.colour = "red";

    }

    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;

    }

    public double getArea() {
        return radius*radius* Math.PI;
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + getArea() +
                ", circumference=" + getCircumference() +
                ", colour='" + colour + '\'' +
                '}';
    }
}
