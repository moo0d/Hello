package week3_2.Task1;

public class VehicleDemo {

    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        System.out.println(" ");
        Car car = new Car("Car", "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        Bus bus = new Bus("Bus", "Diesel", 40);
        car.start();
        car.stop();
        car.getInfo();
        System.out.println(" ");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        System.out.println(" ");
        bus.start();
        bus.stop();
        bus.getInfo();
    }
}
