package week3_2.Task2and3;


public class VehicleDemo2 {

    public static void main(String[] args) {
        Car2 car = new Car2("Car", "Petrol", "Red");
        Motorcycle2 motorcycle = new Motorcycle2("Motorcycle", "Gasoline", "Black");
        Bus2 bus = new Bus2("Bus", "Diesel", "Blue", 40);

        car.start();
        car.stop();
        car.honk();
        car.engineSound();
        System.out.println(" ");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.honk();
        motorcycle.engineSound();
        System.out.println(" ");
        bus.start();
        bus.stop();
        bus.honk();
        bus.engineSound();
        System.out.println();
        ///////////////////////
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Electric Motorcycle", "Electricity", "Black", true);
        ElectricCar electricCar = new ElectricCar("Electric Car", "Electricity", "Navy", true);

        electricMotorcycle.honk();
        electricMotorcycle.charge();
        electricMotorcycle.engineSound();
        electricMotorcycle.getElectricInfo();
        System.out.println(" ");
        electricCar.honk();
        electricCar.charge();
        electricCar.engineSound();
        electricCar.getElectricInfo();
        System.out.println(" ");
        /////////////////
        bus.calculateFuelEfficiency(300, 30);
        car.calculateFuelEfficiency(100,7);
        motorcycle.calculateFuelEfficiency(100, 5);

    }
}
