public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 1,1, 1, 1);
//        Dog dog = new Dog("labrador", 8 ,20, 2, 4, 1, 20, "short");
//        dog.eat();
////        dog.walk();
//        dog.run();

        RangeRover rr = new RangeRover(34);
        rr.steer(30);
        rr.accelerate(30);
        rr.accelerate(20);
    }
}
