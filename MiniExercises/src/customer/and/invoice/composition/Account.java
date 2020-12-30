package customer.and.invoice.composition;

public class Account {
    private final int ID;
    private final Customer customer;
    private double balance;

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(this.balance - amount >= 0)
            this.balance -= amount;
        else {
            System.out.println("insufficient funds");
        }
    }

}
