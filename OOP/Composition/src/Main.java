import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(25,20);
        Bed bed = new Bed("king", true, true);
        Wardrobe wardrobe = new Wardrobe(10, 15, 5);

        Room rm = new Room(wall, bed, wardrobe);
        System.out.println(rm.wallLength());



    }
}
