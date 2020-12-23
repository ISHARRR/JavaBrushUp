public class CheeseBurger extends Hamburger{
    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot add items to this burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add items to this burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add items to this burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add items to this burger");
    }

    public CheeseBurger() {
        super("Cheese", "White", "Meat", 2.65);
        super.addAddition1("Chips", 3.35);
        super.addAddition1("Drink", 1);


    }
}
