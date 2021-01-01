package customerAndInvoice.composition;

public class Customer {
    private final int ID;
    private final String name;
    private int discount;
    private final char gender;

    public Customer(int ID, String name, int discount, char gender) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
