public class Room {
    private Wall wall;
    private Bed bed;
    private Wardrobe wardrobe;

    public Room(Wall wall, Bed bed, Wardrobe wardrobe){
        this.wall = wall;
        this.bed = bed;
        this.wardrobe = wardrobe;

    }

    public Wall wallLength(){
        return getWall();
    }

    public Wall getWall() {
        return wall;
    }

    public Bed getBed() {
        return bed;
    }
    public Wardrobe getWardrobe() {
        return wardrobe;
    }


}
