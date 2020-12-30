package shapes.inheritance;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String colour, boolean filled, double side) {
        super(colour, filled, side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{"+ super.toString() +"}";
    }

}
