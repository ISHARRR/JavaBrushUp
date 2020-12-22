public class Main {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("bob", "bob@gmail.com");
        System.out.println(person2.getName());
        System.out.println(person2.getEmail());

        VipCustomer person3 = new VipCustomer("smith", "smith@gmail.com", 1000.00);
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
        System.out.println(person3.getCreditLimit());
    }
}
