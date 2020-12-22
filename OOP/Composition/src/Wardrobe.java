public class Wardrobe {
    private int width;
    private int length;
    private int storageCompartments;

    public Wardrobe(int width, int length, int storageCompartments) {
        this.width = width;
        this.length = length;
        this.storageCompartments = storageCompartments;

    }

    public int getWidth() {
        return width;
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

    public int getStorageCompartments() {
        return storageCompartments;
    }

    public void setStorageCompartments(int storageCompartments) {
        this.storageCompartments = storageCompartments;
    }
}
