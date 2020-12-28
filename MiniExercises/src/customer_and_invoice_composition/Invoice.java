package customer_and_invoice_composition;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String  getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountAfterDiscount() {
        return (this.amount = amount * (customer.getDiscount()/100f)+1);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ID=" + ID +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
