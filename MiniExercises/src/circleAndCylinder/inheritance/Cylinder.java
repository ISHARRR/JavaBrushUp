package circleAndCylinder.inheritance;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String colour, double height) {
        super(radius, colour);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() +
                "height=" + height +
                '}';
    }
}
