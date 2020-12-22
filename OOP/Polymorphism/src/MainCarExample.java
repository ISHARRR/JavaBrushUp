class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car - startEngine()";
    }

    public String accelerate() {
        return "Car - accelerate()";
    }

    public String brake() {
        return "Car - brake()";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }
}

class RangeRover extends Car{
    public RangeRover(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "RangeRover - startEngine()";
    }

    @Override
    public String accelerate() {
        return "RangeRover - accelerate()";
    }

    @Override
    public String brake() {
        return "RangeRover - brake()";
    }
}

class Fiesta extends Car{
    public Fiesta(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Fiesta - startEngine()";
    }

    @Override
    public String accelerate() {
        return "Fiesta - accelerate()";
    }

    @Override
    public String brake() {
        return "Fiesta - brake()";
    }
}

public class MainCarExample {
    public static void main(String[] args) {

        Car car = new Car (6, "Base Car");
        System.out.println(car.accelerate());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        RangeRover rr = new RangeRover (8, "Range Rover bittchh");
        System.out.println(rr.accelerate());
        System.out.println(rr.accelerate());
        System.out.println(rr.brake());
        System.out.println(rr.getName());
    }
}
