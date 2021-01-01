package geoObjectAndResizable.Inferfaces;

public class Circel implements GeometricObject{
    protected double radius = 1.0;

    public Circel(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public double getArea() {
        return ((radius*radius)*Math.PI);
    }

    @Override
    public String toString() {
        return "Circel{" +
                "radius=" + radius +
                '}';
    }
}
