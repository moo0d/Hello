package week3_2.Task2and3and4;

public class ElectricCar extends AbstractVehicle implements ElectricVehicle {
    private boolean isElectric;
    public ElectricCar(String type, String fuel, String color, boolean isElectric) {
        super(type, fuel, color);
        this.isElectric = isElectric;
    }

    @Override
    void honk() {

        System.out.println(type + " Honk: tUUUUU...");
    }

    @Override
    void engineSound() {

        System.out.println(type + " Engine Sound: hhhhhhhhhhhhhhhhhh...");
    }

    @Override
    public void charge() {
        System.out.println("Charging car: " + type);
    }
    @Override
    public void getElectricInfo(){
        System.out.println(type + " Information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println("Electric: " + isElectric);

    }
}
