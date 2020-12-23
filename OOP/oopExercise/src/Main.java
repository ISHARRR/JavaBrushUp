public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Brown", "meat", 3.35);
        double price = hamburger.hamburgerPrice();
        hamburger.addAddition1("Tomato" , 0.30);
        hamburger.addAddition2("Cheese" , 0.50);
        System.out.println("Total price is: " + hamburger.hamburgerPrice());

        VeggieBurger veggieBurger = new VeggieBurger("Veg", 3.60);
        veggieBurger.addHealthyExtra1("More Veg", 2.3);
        veggieBurger.addHealthyExtra2("Beans", 2);
        System.out.println("Total price is: " + veggieBurger.hamburgerPrice());

        CheeseBurger cheeseBurger = new CheeseBurger();
        cheeseBurger.addAddition1("should not work", 2.3);
        System.out.println(cheeseBurger.hamburgerPrice());
    }
}
