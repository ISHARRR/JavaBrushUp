public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String breadRoll, String meat, double price){
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public void addAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double hamburgerPrice() {
        double basePrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRoll + " roll"
                           + " price is " + this.price);
        if(this.addition1Name != null){
            basePrice += addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addition2Name != null){
            basePrice += addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null){
            basePrice += addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name != null){
            basePrice += addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return basePrice;
    }

}
