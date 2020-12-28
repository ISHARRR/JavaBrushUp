package customer_and_invoice_composition;

public class Main {
    public static void main(String[] args) {
        Customer ishar = new Customer(1,"Ishar", 10, 'm');
        System.out.println(ishar);
        Account isharAccount = new Account(1, ishar, 5000);
        System.out.println(isharAccount);
        Invoice isharInvoice = new Invoice(1, ishar, 500);
        System.out.println(isharInvoice);
    }
}
