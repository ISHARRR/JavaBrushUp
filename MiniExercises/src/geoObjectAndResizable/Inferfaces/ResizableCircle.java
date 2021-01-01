package geoObjectAndResizable.Inferfaces;

public class ResizableCircle extends Circel implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius = Math.round(radius*((percent/100f)+1));
    }
}
