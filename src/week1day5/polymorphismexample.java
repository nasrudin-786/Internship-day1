package week1day5;

public class polymorphismexample {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.drive();

        Vehicle v2 = new Car();
        v2.drive();

        Vehicle v3 = new Truck();
        v3.drive();
    }
}

class Vehicle {
    void drive() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving fast");
    }
}

class Truck extends Vehicle {
    @Override
    void drive() {
        System.out.println("Truck is carrying load");
    }
}
