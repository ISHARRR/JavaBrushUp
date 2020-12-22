public class Wall {
    private int width;
    private int length;

    public Wall(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return (int) (width);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
