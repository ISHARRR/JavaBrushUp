public class VeggieBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public VeggieBurger(String meat, double price) {
        super("Healthy", "White", meat, price);
        this.healthyExtra1Name = healthyExtra1Name;
    }

    public void addHealthyExtra1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyExtra2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double hamburgerPrice() {
        double price = super.hamburgerPrice();

        if(this.healthyExtra1Name != null){
            price += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null){
            price += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return price;
    }
}
