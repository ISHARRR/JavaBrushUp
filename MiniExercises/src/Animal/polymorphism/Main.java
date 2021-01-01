package Animal.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();


        // Using Polymorphism
        Dog dog = new Dog();
        dog.greeting();
        BigDog bigDog = new BigDog();
        bigDog.greeting(dog);


        // Downcast
        Dog dog2 = (Dog)dog;
        BigDog bigDog2 = (BigDog)bigDog;
        Dog dog3 = (Dog)bigDog;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
