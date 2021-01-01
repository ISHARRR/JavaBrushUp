package geoObjectAndResizable.Inferfaces;

public class Main {
    public static void main(String[] args) {
        Circel c = new Circel(10);
        System.out.println(c);
        ResizableCircle rc = new ResizableCircle(10);
        System.out.println(rc);
        rc.resize(10);
        System.out.println(rc);
    }
}
