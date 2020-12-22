public class Bed {
    private String size;
    private boolean pillows;
    private boolean sheets;

    public Bed(String size, boolean pillows, boolean sheets){
        this.size = size;
        this.pillows = pillows;
        this.sheets = sheets;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isPillows() {
        return pillows;
    }

    public void setPillows(boolean pillows) {
        this.pillows = pillows;
    }

    public boolean isSheets() {
        return sheets;
    }

    public void setSheets(boolean sheets) {
        this.sheets = sheets;
    }
}
